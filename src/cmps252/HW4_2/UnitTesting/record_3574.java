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

@Tag("37")
class Record_3574 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3574: FirstName is Warren")
	void FirstNameOfRecord3574() {
		assertEquals("Warren", customers.get(3573).getFirstName());
	}

	@Test
	@DisplayName("Record 3574: LastName is Doop")
	void LastNameOfRecord3574() {
		assertEquals("Doop", customers.get(3573).getLastName());
	}

	@Test
	@DisplayName("Record 3574: Company is Sawyer & Associates")
	void CompanyOfRecord3574() {
		assertEquals("Sawyer & Associates", customers.get(3573).getCompany());
	}

	@Test
	@DisplayName("Record 3574: Address is Hwy 8")
	void AddressOfRecord3574() {
		assertEquals("Hwy 8", customers.get(3573).getAddress());
	}

	@Test
	@DisplayName("Record 3574: City is Troy")
	void CityOfRecord3574() {
		assertEquals("Troy", customers.get(3573).getCity());
	}

	@Test
	@DisplayName("Record 3574: County is Latah")
	void CountyOfRecord3574() {
		assertEquals("Latah", customers.get(3573).getCounty());
	}

	@Test
	@DisplayName("Record 3574: State is ID")
	void StateOfRecord3574() {
		assertEquals("ID", customers.get(3573).getState());
	}

	@Test
	@DisplayName("Record 3574: ZIP is 83871")
	void ZIPOfRecord3574() {
		assertEquals("83871", customers.get(3573).getZIP());
	}

	@Test
	@DisplayName("Record 3574: Phone is 208-835-4283")
	void PhoneOfRecord3574() {
		assertEquals("208-835-4283", customers.get(3573).getPhone());
	}

	@Test
	@DisplayName("Record 3574: Fax is 208-835-4276")
	void FaxOfRecord3574() {
		assertEquals("208-835-4276", customers.get(3573).getFax());
	}

	@Test
	@DisplayName("Record 3574: Email is warren@doop.com")
	void EmailOfRecord3574() {
		assertEquals("warren@doop.com", customers.get(3573).getEmail());
	}

	@Test
	@DisplayName("Record 3574: Web is http://www.warrendoop.com")
	void WebOfRecord3574() {
		assertEquals("http://www.warrendoop.com", customers.get(3573).getWeb());
	}
}
