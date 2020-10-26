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
class Record_87 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 87: FirstName is Aurora")
	void FirstNameOfRecord87() {
		assertEquals("Aurora", customers.get(86).getFirstName());
	}

	@Test
	@DisplayName("Record 87: LastName is Kaminer")
	void LastNameOfRecord87() {
		assertEquals("Kaminer", customers.get(86).getLastName());
	}

	@Test
	@DisplayName("Record 87: Company is Sumter Merchants Association")
	void CompanyOfRecord87() {
		assertEquals("Sumter Merchants Association", customers.get(86).getCompany());
	}

	@Test
	@DisplayName("Record 87: Address is 100 Atherton Dr")
	void AddressOfRecord87() {
		assertEquals("100 Atherton Dr", customers.get(86).getAddress());
	}

	@Test
	@DisplayName("Record 87: City is Metairie")
	void CityOfRecord87() {
		assertEquals("Metairie", customers.get(86).getCity());
	}

	@Test
	@DisplayName("Record 87: County is Jefferson")
	void CountyOfRecord87() {
		assertEquals("Jefferson", customers.get(86).getCounty());
	}

	@Test
	@DisplayName("Record 87: State is LA")
	void StateOfRecord87() {
		assertEquals("LA", customers.get(86).getState());
	}

	@Test
	@DisplayName("Record 87: ZIP is 70005")
	void ZIPOfRecord87() {
		assertEquals("70005", customers.get(86).getZIP());
	}

	@Test
	@DisplayName("Record 87: Phone is 504-836-0328")
	void PhoneOfRecord87() {
		assertEquals("504-836-0328", customers.get(86).getPhone());
	}

	@Test
	@DisplayName("Record 87: Fax is 504-836-2978")
	void FaxOfRecord87() {
		assertEquals("504-836-2978", customers.get(86).getFax());
	}

	@Test
	@DisplayName("Record 87: Email is aurora@kaminer.com")
	void EmailOfRecord87() {
		assertEquals("aurora@kaminer.com", customers.get(86).getEmail());
	}

	@Test
	@DisplayName("Record 87: Web is http://www.aurorakaminer.com")
	void WebOfRecord87() {
		assertEquals("http://www.aurorakaminer.com", customers.get(86).getWeb());
	}
}
