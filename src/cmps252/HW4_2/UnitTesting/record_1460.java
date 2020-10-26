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

@Tag("3")
class Record_1460 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1460: FirstName is Fran")
	void FirstNameOfRecord1460() {
		assertEquals("Fran", customers.get(1459).getFirstName());
	}

	@Test
	@DisplayName("Record 1460: LastName is Disbro")
	void LastNameOfRecord1460() {
		assertEquals("Disbro", customers.get(1459).getLastName());
	}

	@Test
	@DisplayName("Record 1460: Company is Days Inn Downtown")
	void CompanyOfRecord1460() {
		assertEquals("Days Inn Downtown", customers.get(1459).getCompany());
	}

	@Test
	@DisplayName("Record 1460: Address is 2170 N Academy Ave")
	void AddressOfRecord1460() {
		assertEquals("2170 N Academy Ave", customers.get(1459).getAddress());
	}

	@Test
	@DisplayName("Record 1460: City is Sanger")
	void CityOfRecord1460() {
		assertEquals("Sanger", customers.get(1459).getCity());
	}

	@Test
	@DisplayName("Record 1460: County is Fresno")
	void CountyOfRecord1460() {
		assertEquals("Fresno", customers.get(1459).getCounty());
	}

	@Test
	@DisplayName("Record 1460: State is CA")
	void StateOfRecord1460() {
		assertEquals("CA", customers.get(1459).getState());
	}

	@Test
	@DisplayName("Record 1460: ZIP is 93657")
	void ZIPOfRecord1460() {
		assertEquals("93657", customers.get(1459).getZIP());
	}

	@Test
	@DisplayName("Record 1460: Phone is 559-875-2885")
	void PhoneOfRecord1460() {
		assertEquals("559-875-2885", customers.get(1459).getPhone());
	}

	@Test
	@DisplayName("Record 1460: Fax is 559-875-2528")
	void FaxOfRecord1460() {
		assertEquals("559-875-2528", customers.get(1459).getFax());
	}

	@Test
	@DisplayName("Record 1460: Email is fran@disbro.com")
	void EmailOfRecord1460() {
		assertEquals("fran@disbro.com", customers.get(1459).getEmail());
	}

	@Test
	@DisplayName("Record 1460: Web is http://www.frandisbro.com")
	void WebOfRecord1460() {
		assertEquals("http://www.frandisbro.com", customers.get(1459).getWeb());
	}
}
