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

@Tag("17")
class Record_3897 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3897: FirstName is Kylie")
	void FirstNameOfRecord3897() {
		assertEquals("Kylie", customers.get(3896).getFirstName());
	}

	@Test
	@DisplayName("Record 3897: LastName is Fleeks")
	void LastNameOfRecord3897() {
		assertEquals("Fleeks", customers.get(3896).getLastName());
	}

	@Test
	@DisplayName("Record 3897: Company is General Sciences Corp")
	void CompanyOfRecord3897() {
		assertEquals("General Sciences Corp", customers.get(3896).getCompany());
	}

	@Test
	@DisplayName("Record 3897: Address is 641 Higuera St")
	void AddressOfRecord3897() {
		assertEquals("641 Higuera St", customers.get(3896).getAddress());
	}

	@Test
	@DisplayName("Record 3897: City is San Luis Obispo")
	void CityOfRecord3897() {
		assertEquals("San Luis Obispo", customers.get(3896).getCity());
	}

	@Test
	@DisplayName("Record 3897: County is San Luis Obispo")
	void CountyOfRecord3897() {
		assertEquals("San Luis Obispo", customers.get(3896).getCounty());
	}

	@Test
	@DisplayName("Record 3897: State is CA")
	void StateOfRecord3897() {
		assertEquals("CA", customers.get(3896).getState());
	}

	@Test
	@DisplayName("Record 3897: ZIP is 93401")
	void ZIPOfRecord3897() {
		assertEquals("93401", customers.get(3896).getZIP());
	}

	@Test
	@DisplayName("Record 3897: Phone is 805-543-6738")
	void PhoneOfRecord3897() {
		assertEquals("805-543-6738", customers.get(3896).getPhone());
	}

	@Test
	@DisplayName("Record 3897: Fax is 805-543-8266")
	void FaxOfRecord3897() {
		assertEquals("805-543-8266", customers.get(3896).getFax());
	}

	@Test
	@DisplayName("Record 3897: Email is kylie@fleeks.com")
	void EmailOfRecord3897() {
		assertEquals("kylie@fleeks.com", customers.get(3896).getEmail());
	}

	@Test
	@DisplayName("Record 3897: Web is http://www.kyliefleeks.com")
	void WebOfRecord3897() {
		assertEquals("http://www.kyliefleeks.com", customers.get(3896).getWeb());
	}
}
