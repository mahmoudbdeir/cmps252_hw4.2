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
class Record_2556 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2556: FirstName is Lou")
	void FirstNameOfRecord2556() {
		assertEquals("Lou", customers.get(2555).getFirstName());
	}

	@Test
	@DisplayName("Record 2556: LastName is Madock")
	void LastNameOfRecord2556() {
		assertEquals("Madock", customers.get(2555).getLastName());
	}

	@Test
	@DisplayName("Record 2556: Company is Mama Bs Giant Subs")
	void CompanyOfRecord2556() {
		assertEquals("Mama Bs Giant Subs", customers.get(2555).getCompany());
	}

	@Test
	@DisplayName("Record 2556: Address is 2425 Vineyard Ave")
	void AddressOfRecord2556() {
		assertEquals("2425 Vineyard Ave", customers.get(2555).getAddress());
	}

	@Test
	@DisplayName("Record 2556: City is Escondido")
	void CityOfRecord2556() {
		assertEquals("Escondido", customers.get(2555).getCity());
	}

	@Test
	@DisplayName("Record 2556: County is San Diego")
	void CountyOfRecord2556() {
		assertEquals("San Diego", customers.get(2555).getCounty());
	}

	@Test
	@DisplayName("Record 2556: State is CA")
	void StateOfRecord2556() {
		assertEquals("CA", customers.get(2555).getState());
	}

	@Test
	@DisplayName("Record 2556: ZIP is 92029")
	void ZIPOfRecord2556() {
		assertEquals("92029", customers.get(2555).getZIP());
	}

	@Test
	@DisplayName("Record 2556: Phone is 760-746-8100")
	void PhoneOfRecord2556() {
		assertEquals("760-746-8100", customers.get(2555).getPhone());
	}

	@Test
	@DisplayName("Record 2556: Fax is 760-746-6272")
	void FaxOfRecord2556() {
		assertEquals("760-746-6272", customers.get(2555).getFax());
	}

	@Test
	@DisplayName("Record 2556: Email is lou@madock.com")
	void EmailOfRecord2556() {
		assertEquals("lou@madock.com", customers.get(2555).getEmail());
	}

	@Test
	@DisplayName("Record 2556: Web is http://www.loumadock.com")
	void WebOfRecord2556() {
		assertEquals("http://www.loumadock.com", customers.get(2555).getWeb());
	}
}
