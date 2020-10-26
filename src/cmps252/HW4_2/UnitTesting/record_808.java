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
class Record_808 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 808: FirstName is Jude")
	void FirstNameOfRecord808() {
		assertEquals("Jude", customers.get(807).getFirstName());
	}

	@Test
	@DisplayName("Record 808: LastName is Medlock")
	void LastNameOfRecord808() {
		assertEquals("Medlock", customers.get(807).getLastName());
	}

	@Test
	@DisplayName("Record 808: Company is Premium Coffee")
	void CompanyOfRecord808() {
		assertEquals("Premium Coffee", customers.get(807).getCompany());
	}

	@Test
	@DisplayName("Record 808: Address is 1015 Americas Aven")
	void AddressOfRecord808() {
		assertEquals("1015 Americas Aven", customers.get(807).getAddress());
	}

	@Test
	@DisplayName("Record 808: City is New York")
	void CityOfRecord808() {
		assertEquals("New York", customers.get(807).getCity());
	}

	@Test
	@DisplayName("Record 808: County is New York")
	void CountyOfRecord808() {
		assertEquals("New York", customers.get(807).getCounty());
	}

	@Test
	@DisplayName("Record 808: State is NY")
	void StateOfRecord808() {
		assertEquals("NY", customers.get(807).getState());
	}

	@Test
	@DisplayName("Record 808: ZIP is 10018")
	void ZIPOfRecord808() {
		assertEquals("10018", customers.get(807).getZIP());
	}

	@Test
	@DisplayName("Record 808: Phone is 212-719-9633")
	void PhoneOfRecord808() {
		assertEquals("212-719-9633", customers.get(807).getPhone());
	}

	@Test
	@DisplayName("Record 808: Fax is 212-719-9501")
	void FaxOfRecord808() {
		assertEquals("212-719-9501", customers.get(807).getFax());
	}

	@Test
	@DisplayName("Record 808: Email is jude@medlock.com")
	void EmailOfRecord808() {
		assertEquals("jude@medlock.com", customers.get(807).getEmail());
	}

	@Test
	@DisplayName("Record 808: Web is http://www.judemedlock.com")
	void WebOfRecord808() {
		assertEquals("http://www.judemedlock.com", customers.get(807).getWeb());
	}
}
