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

@Tag("4")
class Record_1931 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1931: FirstName is Sylvester")
	void FirstNameOfRecord1931() {
		assertEquals("Sylvester", customers.get(1930).getFirstName());
	}

	@Test
	@DisplayName("Record 1931: LastName is Hilu")
	void LastNameOfRecord1931() {
		assertEquals("Hilu", customers.get(1930).getLastName());
	}

	@Test
	@DisplayName("Record 1931: Company is Hopkins, Stephen P Esq")
	void CompanyOfRecord1931() {
		assertEquals("Hopkins, Stephen P Esq", customers.get(1930).getCompany());
	}

	@Test
	@DisplayName("Record 1931: Address is 311 Market St")
	void AddressOfRecord1931() {
		assertEquals("311 Market St", customers.get(1930).getAddress());
	}

	@Test
	@DisplayName("Record 1931: City is Kingston")
	void CityOfRecord1931() {
		assertEquals("Kingston", customers.get(1930).getCity());
	}

	@Test
	@DisplayName("Record 1931: County is Luzerne")
	void CountyOfRecord1931() {
		assertEquals("Luzerne", customers.get(1930).getCounty());
	}

	@Test
	@DisplayName("Record 1931: State is PA")
	void StateOfRecord1931() {
		assertEquals("PA", customers.get(1930).getState());
	}

	@Test
	@DisplayName("Record 1931: ZIP is 18704")
	void ZIPOfRecord1931() {
		assertEquals("18704", customers.get(1930).getZIP());
	}

	@Test
	@DisplayName("Record 1931: Phone is 570-283-5211")
	void PhoneOfRecord1931() {
		assertEquals("570-283-5211", customers.get(1930).getPhone());
	}

	@Test
	@DisplayName("Record 1931: Fax is 570-283-2417")
	void FaxOfRecord1931() {
		assertEquals("570-283-2417", customers.get(1930).getFax());
	}

	@Test
	@DisplayName("Record 1931: Email is sylvester@hilu.com")
	void EmailOfRecord1931() {
		assertEquals("sylvester@hilu.com", customers.get(1930).getEmail());
	}

	@Test
	@DisplayName("Record 1931: Web is http://www.sylvesterhilu.com")
	void WebOfRecord1931() {
		assertEquals("http://www.sylvesterhilu.com", customers.get(1930).getWeb());
	}
}
