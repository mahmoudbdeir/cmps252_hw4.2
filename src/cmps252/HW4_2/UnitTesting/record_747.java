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

@Tag("19")
class Record_747 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 747: FirstName is Bonita")
	void FirstNameOfRecord747() {
		assertEquals("Bonita", customers.get(746).getFirstName());
	}

	@Test
	@DisplayName("Record 747: LastName is Axsom")
	void LastNameOfRecord747() {
		assertEquals("Axsom", customers.get(746).getLastName());
	}

	@Test
	@DisplayName("Record 747: Company is Walker, Lenora Esq")
	void CompanyOfRecord747() {
		assertEquals("Walker, Lenora Esq", customers.get(746).getCompany());
	}

	@Test
	@DisplayName("Record 747: Address is 10841 Rough")
	void AddressOfRecord747() {
		assertEquals("10841 Rough", customers.get(746).getAddress());
	}

	@Test
	@DisplayName("Record 747: City is Grass Valley")
	void CityOfRecord747() {
		assertEquals("Grass Valley", customers.get(746).getCity());
	}

	@Test
	@DisplayName("Record 747: County is Nevada")
	void CountyOfRecord747() {
		assertEquals("Nevada", customers.get(746).getCounty());
	}

	@Test
	@DisplayName("Record 747: State is CA")
	void StateOfRecord747() {
		assertEquals("CA", customers.get(746).getState());
	}

	@Test
	@DisplayName("Record 747: ZIP is 95945")
	void ZIPOfRecord747() {
		assertEquals("95945", customers.get(746).getZIP());
	}

	@Test
	@DisplayName("Record 747: Phone is 530-273-8974")
	void PhoneOfRecord747() {
		assertEquals("530-273-8974", customers.get(746).getPhone());
	}

	@Test
	@DisplayName("Record 747: Fax is 530-273-4235")
	void FaxOfRecord747() {
		assertEquals("530-273-4235", customers.get(746).getFax());
	}

	@Test
	@DisplayName("Record 747: Email is bonita@axsom.com")
	void EmailOfRecord747() {
		assertEquals("bonita@axsom.com", customers.get(746).getEmail());
	}

	@Test
	@DisplayName("Record 747: Web is http://www.bonitaaxsom.com")
	void WebOfRecord747() {
		assertEquals("http://www.bonitaaxsom.com", customers.get(746).getWeb());
	}
}
