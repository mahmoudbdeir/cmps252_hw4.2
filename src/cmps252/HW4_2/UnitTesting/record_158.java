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
class Record_158 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 158: FirstName is Clifford")
	void FirstNameOfRecord158() {
		assertEquals("Clifford", customers.get(157).getFirstName());
	}

	@Test
	@DisplayName("Record 158: LastName is Nakao")
	void LastNameOfRecord158() {
		assertEquals("Nakao", customers.get(157).getLastName());
	}

	@Test
	@DisplayName("Record 158: Company is Designer Financial Svc Inc")
	void CompanyOfRecord158() {
		assertEquals("Designer Financial Svc Inc", customers.get(157).getCompany());
	}

	@Test
	@DisplayName("Record 158: Address is 11414 Livingston Rd")
	void AddressOfRecord158() {
		assertEquals("11414 Livingston Rd", customers.get(157).getAddress());
	}

	@Test
	@DisplayName("Record 158: City is Fort Washington")
	void CityOfRecord158() {
		assertEquals("Fort Washington", customers.get(157).getCity());
	}

	@Test
	@DisplayName("Record 158: County is Prince Georges")
	void CountyOfRecord158() {
		assertEquals("Prince Georges", customers.get(157).getCounty());
	}

	@Test
	@DisplayName("Record 158: State is MD")
	void StateOfRecord158() {
		assertEquals("MD", customers.get(157).getState());
	}

	@Test
	@DisplayName("Record 158: ZIP is 20744")
	void ZIPOfRecord158() {
		assertEquals("20744", customers.get(157).getZIP());
	}

	@Test
	@DisplayName("Record 158: Phone is 301-292-9997")
	void PhoneOfRecord158() {
		assertEquals("301-292-9997", customers.get(157).getPhone());
	}

	@Test
	@DisplayName("Record 158: Fax is 301-292-8874")
	void FaxOfRecord158() {
		assertEquals("301-292-8874", customers.get(157).getFax());
	}

	@Test
	@DisplayName("Record 158: Email is clifford@nakao.com")
	void EmailOfRecord158() {
		assertEquals("clifford@nakao.com", customers.get(157).getEmail());
	}

	@Test
	@DisplayName("Record 158: Web is http://www.cliffordnakao.com")
	void WebOfRecord158() {
		assertEquals("http://www.cliffordnakao.com", customers.get(157).getWeb());
	}
}
