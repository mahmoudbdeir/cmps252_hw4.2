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

@Tag("8")
class Record_4717 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4717: FirstName is Catrina")
	void FirstNameOfRecord4717() {
		assertEquals("Catrina", customers.get(4716).getFirstName());
	}

	@Test
	@DisplayName("Record 4717: LastName is Navanjo")
	void LastNameOfRecord4717() {
		assertEquals("Navanjo", customers.get(4716).getLastName());
	}

	@Test
	@DisplayName("Record 4717: Company is A M D Inc")
	void CompanyOfRecord4717() {
		assertEquals("A M D Inc", customers.get(4716).getCompany());
	}

	@Test
	@DisplayName("Record 4717: Address is 233 Mccrea St  #-501")
	void AddressOfRecord4717() {
		assertEquals("233 Mccrea St  #-501", customers.get(4716).getAddress());
	}

	@Test
	@DisplayName("Record 4717: City is Indianapolis")
	void CityOfRecord4717() {
		assertEquals("Indianapolis", customers.get(4716).getCity());
	}

	@Test
	@DisplayName("Record 4717: County is Marion")
	void CountyOfRecord4717() {
		assertEquals("Marion", customers.get(4716).getCounty());
	}

	@Test
	@DisplayName("Record 4717: State is IN")
	void StateOfRecord4717() {
		assertEquals("IN", customers.get(4716).getState());
	}

	@Test
	@DisplayName("Record 4717: ZIP is 46225")
	void ZIPOfRecord4717() {
		assertEquals("46225", customers.get(4716).getZIP());
	}

	@Test
	@DisplayName("Record 4717: Phone is 317-632-4009")
	void PhoneOfRecord4717() {
		assertEquals("317-632-4009", customers.get(4716).getPhone());
	}

	@Test
	@DisplayName("Record 4717: Fax is 317-632-1155")
	void FaxOfRecord4717() {
		assertEquals("317-632-1155", customers.get(4716).getFax());
	}

	@Test
	@DisplayName("Record 4717: Email is catrina@navanjo.com")
	void EmailOfRecord4717() {
		assertEquals("catrina@navanjo.com", customers.get(4716).getEmail());
	}

	@Test
	@DisplayName("Record 4717: Web is http://www.catrinanavanjo.com")
	void WebOfRecord4717() {
		assertEquals("http://www.catrinanavanjo.com", customers.get(4716).getWeb());
	}
}
