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

@Tag("24")
class Record_818 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 818: FirstName is Mary")
	void FirstNameOfRecord818() {
		assertEquals("Mary", customers.get(817).getFirstName());
	}

	@Test
	@DisplayName("Record 818: LastName is Bolon")
	void LastNameOfRecord818() {
		assertEquals("Bolon", customers.get(817).getLastName());
	}

	@Test
	@DisplayName("Record 818: Company is Step Technology Inc")
	void CompanyOfRecord818() {
		assertEquals("Step Technology Inc", customers.get(817).getCompany());
	}

	@Test
	@DisplayName("Record 818: Address is 3773d Victory Blvd")
	void AddressOfRecord818() {
		assertEquals("3773d Victory Blvd", customers.get(817).getAddress());
	}

	@Test
	@DisplayName("Record 818: City is Staten Island")
	void CityOfRecord818() {
		assertEquals("Staten Island", customers.get(817).getCity());
	}

	@Test
	@DisplayName("Record 818: County is Richmond")
	void CountyOfRecord818() {
		assertEquals("Richmond", customers.get(817).getCounty());
	}

	@Test
	@DisplayName("Record 818: State is NY")
	void StateOfRecord818() {
		assertEquals("NY", customers.get(817).getState());
	}

	@Test
	@DisplayName("Record 818: ZIP is 10314")
	void ZIPOfRecord818() {
		assertEquals("10314", customers.get(817).getZIP());
	}

	@Test
	@DisplayName("Record 818: Phone is 718-983-8738")
	void PhoneOfRecord818() {
		assertEquals("718-983-8738", customers.get(817).getPhone());
	}

	@Test
	@DisplayName("Record 818: Fax is 718-983-8816")
	void FaxOfRecord818() {
		assertEquals("718-983-8816", customers.get(817).getFax());
	}

	@Test
	@DisplayName("Record 818: Email is mary@bolon.com")
	void EmailOfRecord818() {
		assertEquals("mary@bolon.com", customers.get(817).getEmail());
	}

	@Test
	@DisplayName("Record 818: Web is http://www.marybolon.com")
	void WebOfRecord818() {
		assertEquals("http://www.marybolon.com", customers.get(817).getWeb());
	}
}
