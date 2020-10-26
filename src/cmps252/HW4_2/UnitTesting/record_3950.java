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

@Tag("40")
class Record_3950 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3950: FirstName is Amy")
	void FirstNameOfRecord3950() {
		assertEquals("Amy", customers.get(3949).getFirstName());
	}

	@Test
	@DisplayName("Record 3950: LastName is Ly")
	void LastNameOfRecord3950() {
		assertEquals("Ly", customers.get(3949).getLastName());
	}

	@Test
	@DisplayName("Record 3950: Company is Someplace Special Ii")
	void CompanyOfRecord3950() {
		assertEquals("Someplace Special Ii", customers.get(3949).getCompany());
	}

	@Test
	@DisplayName("Record 3950: Address is 2727 6th Ave Se")
	void AddressOfRecord3950() {
		assertEquals("2727 6th Ave Se", customers.get(3949).getAddress());
	}

	@Test
	@DisplayName("Record 3950: City is Aberdeen")
	void CityOfRecord3950() {
		assertEquals("Aberdeen", customers.get(3949).getCity());
	}

	@Test
	@DisplayName("Record 3950: County is Brown")
	void CountyOfRecord3950() {
		assertEquals("Brown", customers.get(3949).getCounty());
	}

	@Test
	@DisplayName("Record 3950: State is SD")
	void StateOfRecord3950() {
		assertEquals("SD", customers.get(3949).getState());
	}

	@Test
	@DisplayName("Record 3950: ZIP is 57401")
	void ZIPOfRecord3950() {
		assertEquals("57401", customers.get(3949).getZIP());
	}

	@Test
	@DisplayName("Record 3950: Phone is 605-225-7861")
	void PhoneOfRecord3950() {
		assertEquals("605-225-7861", customers.get(3949).getPhone());
	}

	@Test
	@DisplayName("Record 3950: Fax is 605-225-1225")
	void FaxOfRecord3950() {
		assertEquals("605-225-1225", customers.get(3949).getFax());
	}

	@Test
	@DisplayName("Record 3950: Email is amy@ly.com")
	void EmailOfRecord3950() {
		assertEquals("amy@ly.com", customers.get(3949).getEmail());
	}

	@Test
	@DisplayName("Record 3950: Web is http://www.amyly.com")
	void WebOfRecord3950() {
		assertEquals("http://www.amyly.com", customers.get(3949).getWeb());
	}
}
