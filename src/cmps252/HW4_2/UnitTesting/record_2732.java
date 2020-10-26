package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("13")
class Record_2732 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2732: FirstName is Eleanor")
	void FirstNameOfRecord2732() {
		assertEquals("Eleanor", customers.get(2731).getFirstName());
	}

	@Test
	@DisplayName("Record 2732: LastName is Patrias")
	void LastNameOfRecord2732() {
		assertEquals("Patrias", customers.get(2731).getLastName());
	}

	@Test
	@DisplayName("Record 2732: Company is Office Connection")
	void CompanyOfRecord2732() {
		assertEquals("Office Connection", customers.get(2731).getCompany());
	}

	@Test
	@DisplayName("Record 2732: Address is 16 Ray Pl")
	void AddressOfRecord2732() {
		assertEquals("16 Ray Pl", customers.get(2731).getAddress());
	}

	@Test
	@DisplayName("Record 2732: City is Fairfield")
	void CityOfRecord2732() {
		assertEquals("Fairfield", customers.get(2731).getCity());
	}

	@Test
	@DisplayName("Record 2732: County is Essex")
	void CountyOfRecord2732() {
		assertEquals("Essex", customers.get(2731).getCounty());
	}

	@Test
	@DisplayName("Record 2732: State is NJ")
	void StateOfRecord2732() {
		assertEquals("NJ", customers.get(2731).getState());
	}

	@Test
	@DisplayName("Record 2732: ZIP is 7004")
	void ZIPOfRecord2732() {
		assertEquals("7004", customers.get(2731).getZIP());
	}

	@Test
	@DisplayName("Record 2732: Phone is 973-882-4175")
	void PhoneOfRecord2732() {
		assertEquals("973-882-4175", customers.get(2731).getPhone());
	}

	@Test
	@DisplayName("Record 2732: Fax is 973-882-2181")
	void FaxOfRecord2732() {
		assertEquals("973-882-2181", customers.get(2731).getFax());
	}

	@Test
	@DisplayName("Record 2732: Email is eleanor@patrias.com")
	void EmailOfRecord2732() {
		assertEquals("eleanor@patrias.com", customers.get(2731).getEmail());
	}

	@Test
	@DisplayName("Record 2732: Web is http://www.eleanorpatrias.com")
	void WebOfRecord2732() {
		assertEquals("http://www.eleanorpatrias.com", customers.get(2731).getWeb());
	}
}
