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

@Tag("21")
class Record_1093 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1093: FirstName is Maurine")
	void FirstNameOfRecord1093() {
		assertEquals("Maurine", customers.get(1092).getFirstName());
	}

	@Test
	@DisplayName("Record 1093: LastName is Deak")
	void LastNameOfRecord1093() {
		assertEquals("Deak", customers.get(1092).getLastName());
	}

	@Test
	@DisplayName("Record 1093: Company is Kay Slesinger Realty")
	void CompanyOfRecord1093() {
		assertEquals("Kay Slesinger Realty", customers.get(1092).getCompany());
	}

	@Test
	@DisplayName("Record 1093: Address is 968 Shrewsbury Ave")
	void AddressOfRecord1093() {
		assertEquals("968 Shrewsbury Ave", customers.get(1092).getAddress());
	}

	@Test
	@DisplayName("Record 1093: City is Eatontown")
	void CityOfRecord1093() {
		assertEquals("Eatontown", customers.get(1092).getCity());
	}

	@Test
	@DisplayName("Record 1093: County is Monmouth")
	void CountyOfRecord1093() {
		assertEquals("Monmouth", customers.get(1092).getCounty());
	}

	@Test
	@DisplayName("Record 1093: State is NJ")
	void StateOfRecord1093() {
		assertEquals("NJ", customers.get(1092).getState());
	}

	@Test
	@DisplayName("Record 1093: ZIP is 7724")
	void ZIPOfRecord1093() {
		assertEquals("7724", customers.get(1092).getZIP());
	}

	@Test
	@DisplayName("Record 1093: Phone is 732-542-6577")
	void PhoneOfRecord1093() {
		assertEquals("732-542-6577", customers.get(1092).getPhone());
	}

	@Test
	@DisplayName("Record 1093: Fax is 732-542-5718")
	void FaxOfRecord1093() {
		assertEquals("732-542-5718", customers.get(1092).getFax());
	}

	@Test
	@DisplayName("Record 1093: Email is maurine@deak.com")
	void EmailOfRecord1093() {
		assertEquals("maurine@deak.com", customers.get(1092).getEmail());
	}

	@Test
	@DisplayName("Record 1093: Web is http://www.maurinedeak.com")
	void WebOfRecord1093() {
		assertEquals("http://www.maurinedeak.com", customers.get(1092).getWeb());
	}
}
