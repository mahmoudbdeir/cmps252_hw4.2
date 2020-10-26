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
class Record_2821 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2821: FirstName is Tera")
	void FirstNameOfRecord2821() {
		assertEquals("Tera", customers.get(2820).getFirstName());
	}

	@Test
	@DisplayName("Record 2821: LastName is Strevels")
	void LastNameOfRecord2821() {
		assertEquals("Strevels", customers.get(2820).getLastName());
	}

	@Test
	@DisplayName("Record 2821: Company is Allen Myland Inc")
	void CompanyOfRecord2821() {
		assertEquals("Allen Myland Inc", customers.get(2820).getCompany());
	}

	@Test
	@DisplayName("Record 2821: Address is 20 Richey Ave")
	void AddressOfRecord2821() {
		assertEquals("20 Richey Ave", customers.get(2820).getAddress());
	}

	@Test
	@DisplayName("Record 2821: City is Oaklyn")
	void CityOfRecord2821() {
		assertEquals("Oaklyn", customers.get(2820).getCity());
	}

	@Test
	@DisplayName("Record 2821: County is Camden")
	void CountyOfRecord2821() {
		assertEquals("Camden", customers.get(2820).getCounty());
	}

	@Test
	@DisplayName("Record 2821: State is NJ")
	void StateOfRecord2821() {
		assertEquals("NJ", customers.get(2820).getState());
	}

	@Test
	@DisplayName("Record 2821: ZIP is 8107")
	void ZIPOfRecord2821() {
		assertEquals("8107", customers.get(2820).getZIP());
	}

	@Test
	@DisplayName("Record 2821: Phone is 856-854-6755")
	void PhoneOfRecord2821() {
		assertEquals("856-854-6755", customers.get(2820).getPhone());
	}

	@Test
	@DisplayName("Record 2821: Fax is 856-854-8187")
	void FaxOfRecord2821() {
		assertEquals("856-854-8187", customers.get(2820).getFax());
	}

	@Test
	@DisplayName("Record 2821: Email is tera@strevels.com")
	void EmailOfRecord2821() {
		assertEquals("tera@strevels.com", customers.get(2820).getEmail());
	}

	@Test
	@DisplayName("Record 2821: Web is http://www.terastrevels.com")
	void WebOfRecord2821() {
		assertEquals("http://www.terastrevels.com", customers.get(2820).getWeb());
	}
}
