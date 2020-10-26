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

@Tag("33")
class Record_3189 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3189: FirstName is Alonso")
	void FirstNameOfRecord3189() {
		assertEquals("Alonso", customers.get(3188).getFirstName());
	}

	@Test
	@DisplayName("Record 3189: LastName is Kaminsky")
	void LastNameOfRecord3189() {
		assertEquals("Kaminsky", customers.get(3188).getLastName());
	}

	@Test
	@DisplayName("Record 3189: Company is Kmgg 97 7 Fm")
	void CompanyOfRecord3189() {
		assertEquals("Kmgg 97 7 Fm", customers.get(3188).getCompany());
	}

	@Test
	@DisplayName("Record 3189: Address is 234 Main St")
	void AddressOfRecord3189() {
		assertEquals("234 Main St", customers.get(3188).getAddress());
	}

	@Test
	@DisplayName("Record 3189: City is San Mateo")
	void CityOfRecord3189() {
		assertEquals("San Mateo", customers.get(3188).getCity());
	}

	@Test
	@DisplayName("Record 3189: County is San Mateo")
	void CountyOfRecord3189() {
		assertEquals("San Mateo", customers.get(3188).getCounty());
	}

	@Test
	@DisplayName("Record 3189: State is CA")
	void StateOfRecord3189() {
		assertEquals("CA", customers.get(3188).getState());
	}

	@Test
	@DisplayName("Record 3189: ZIP is 94401")
	void ZIPOfRecord3189() {
		assertEquals("94401", customers.get(3188).getZIP());
	}

	@Test
	@DisplayName("Record 3189: Phone is 650-343-1662")
	void PhoneOfRecord3189() {
		assertEquals("650-343-1662", customers.get(3188).getPhone());
	}

	@Test
	@DisplayName("Record 3189: Fax is 650-343-6407")
	void FaxOfRecord3189() {
		assertEquals("650-343-6407", customers.get(3188).getFax());
	}

	@Test
	@DisplayName("Record 3189: Email is alonso@kaminsky.com")
	void EmailOfRecord3189() {
		assertEquals("alonso@kaminsky.com", customers.get(3188).getEmail());
	}

	@Test
	@DisplayName("Record 3189: Web is http://www.alonsokaminsky.com")
	void WebOfRecord3189() {
		assertEquals("http://www.alonsokaminsky.com", customers.get(3188).getWeb());
	}
}
