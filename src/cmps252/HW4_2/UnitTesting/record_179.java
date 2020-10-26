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

@Tag("48")
class Record_179 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 179: FirstName is Lisa")
	void FirstNameOfRecord179() {
		assertEquals("Lisa", customers.get(178).getFirstName());
	}

	@Test
	@DisplayName("Record 179: LastName is Plewa")
	void LastNameOfRecord179() {
		assertEquals("Plewa", customers.get(178).getLastName());
	}

	@Test
	@DisplayName("Record 179: Company is Cote Property Management")
	void CompanyOfRecord179() {
		assertEquals("Cote Property Management", customers.get(178).getCompany());
	}

	@Test
	@DisplayName("Record 179: Address is 4033 State Highway 57")
	void AddressOfRecord179() {
		assertEquals("4033 State Highway 57", customers.get(178).getAddress());
	}

	@Test
	@DisplayName("Record 179: City is De Pere")
	void CityOfRecord179() {
		assertEquals("De Pere", customers.get(178).getCity());
	}

	@Test
	@DisplayName("Record 179: County is Brown")
	void CountyOfRecord179() {
		assertEquals("Brown", customers.get(178).getCounty());
	}

	@Test
	@DisplayName("Record 179: State is WI")
	void StateOfRecord179() {
		assertEquals("WI", customers.get(178).getState());
	}

	@Test
	@DisplayName("Record 179: ZIP is 54115")
	void ZIPOfRecord179() {
		assertEquals("54115", customers.get(178).getZIP());
	}

	@Test
	@DisplayName("Record 179: Phone is 920-336-1430")
	void PhoneOfRecord179() {
		assertEquals("920-336-1430", customers.get(178).getPhone());
	}

	@Test
	@DisplayName("Record 179: Fax is 920-336-3473")
	void FaxOfRecord179() {
		assertEquals("920-336-3473", customers.get(178).getFax());
	}

	@Test
	@DisplayName("Record 179: Email is lisa@plewa.com")
	void EmailOfRecord179() {
		assertEquals("lisa@plewa.com", customers.get(178).getEmail());
	}

	@Test
	@DisplayName("Record 179: Web is http://www.lisaplewa.com")
	void WebOfRecord179() {
		assertEquals("http://www.lisaplewa.com", customers.get(178).getWeb());
	}
}
