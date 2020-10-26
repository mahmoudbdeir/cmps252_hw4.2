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

@Tag("45")
class Record_4527 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4527: FirstName is Lorenzo")
	void FirstNameOfRecord4527() {
		assertEquals("Lorenzo", customers.get(4526).getFirstName());
	}

	@Test
	@DisplayName("Record 4527: LastName is Ratliff")
	void LastNameOfRecord4527() {
		assertEquals("Ratliff", customers.get(4526).getLastName());
	}

	@Test
	@DisplayName("Record 4527: Company is Drennan, James S Esq")
	void CompanyOfRecord4527() {
		assertEquals("Drennan, James S Esq", customers.get(4526).getCompany());
	}

	@Test
	@DisplayName("Record 4527: Address is 1894 N Cleveland Massillon Rd")
	void AddressOfRecord4527() {
		assertEquals("1894 N Cleveland Massillon Rd", customers.get(4526).getAddress());
	}

	@Test
	@DisplayName("Record 4527: City is Akron")
	void CityOfRecord4527() {
		assertEquals("Akron", customers.get(4526).getCity());
	}

	@Test
	@DisplayName("Record 4527: County is Summit")
	void CountyOfRecord4527() {
		assertEquals("Summit", customers.get(4526).getCounty());
	}

	@Test
	@DisplayName("Record 4527: State is OH")
	void StateOfRecord4527() {
		assertEquals("OH", customers.get(4526).getState());
	}

	@Test
	@DisplayName("Record 4527: ZIP is 44333")
	void ZIPOfRecord4527() {
		assertEquals("44333", customers.get(4526).getZIP());
	}

	@Test
	@DisplayName("Record 4527: Phone is 330-666-6984")
	void PhoneOfRecord4527() {
		assertEquals("330-666-6984", customers.get(4526).getPhone());
	}

	@Test
	@DisplayName("Record 4527: Fax is 330-666-3606")
	void FaxOfRecord4527() {
		assertEquals("330-666-3606", customers.get(4526).getFax());
	}

	@Test
	@DisplayName("Record 4527: Email is lorenzo@ratliff.com")
	void EmailOfRecord4527() {
		assertEquals("lorenzo@ratliff.com", customers.get(4526).getEmail());
	}

	@Test
	@DisplayName("Record 4527: Web is http://www.lorenzoratliff.com")
	void WebOfRecord4527() {
		assertEquals("http://www.lorenzoratliff.com", customers.get(4526).getWeb());
	}
}
