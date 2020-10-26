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

@Tag("43")
class Record_2142 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2142: FirstName is Priscilla")
	void FirstNameOfRecord2142() {
		assertEquals("Priscilla", customers.get(2141).getFirstName());
	}

	@Test
	@DisplayName("Record 2142: LastName is Fredicks")
	void LastNameOfRecord2142() {
		assertEquals("Fredicks", customers.get(2141).getLastName());
	}

	@Test
	@DisplayName("Record 2142: Company is Walther, Christopher D Esq")
	void CompanyOfRecord2142() {
		assertEquals("Walther, Christopher D Esq", customers.get(2141).getCompany());
	}

	@Test
	@DisplayName("Record 2142: Address is 9609 Annapolis Rd")
	void AddressOfRecord2142() {
		assertEquals("9609 Annapolis Rd", customers.get(2141).getAddress());
	}

	@Test
	@DisplayName("Record 2142: City is Lanham")
	void CityOfRecord2142() {
		assertEquals("Lanham", customers.get(2141).getCity());
	}

	@Test
	@DisplayName("Record 2142: County is Prince Georges")
	void CountyOfRecord2142() {
		assertEquals("Prince Georges", customers.get(2141).getCounty());
	}

	@Test
	@DisplayName("Record 2142: State is MD")
	void StateOfRecord2142() {
		assertEquals("MD", customers.get(2141).getState());
	}

	@Test
	@DisplayName("Record 2142: ZIP is 20706")
	void ZIPOfRecord2142() {
		assertEquals("20706", customers.get(2141).getZIP());
	}

	@Test
	@DisplayName("Record 2142: Phone is 301-731-6639")
	void PhoneOfRecord2142() {
		assertEquals("301-731-6639", customers.get(2141).getPhone());
	}

	@Test
	@DisplayName("Record 2142: Fax is 301-731-8558")
	void FaxOfRecord2142() {
		assertEquals("301-731-8558", customers.get(2141).getFax());
	}

	@Test
	@DisplayName("Record 2142: Email is priscilla@fredicks.com")
	void EmailOfRecord2142() {
		assertEquals("priscilla@fredicks.com", customers.get(2141).getEmail());
	}

	@Test
	@DisplayName("Record 2142: Web is http://www.priscillafredicks.com")
	void WebOfRecord2142() {
		assertEquals("http://www.priscillafredicks.com", customers.get(2141).getWeb());
	}
}
