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
class Record_1075 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1075: FirstName is Casey")
	void FirstNameOfRecord1075() {
		assertEquals("Casey", customers.get(1074).getFirstName());
	}

	@Test
	@DisplayName("Record 1075: LastName is Bonnifield")
	void LastNameOfRecord1075() {
		assertEquals("Bonnifield", customers.get(1074).getLastName());
	}

	@Test
	@DisplayName("Record 1075: Company is Mann, David C Md")
	void CompanyOfRecord1075() {
		assertEquals("Mann, David C Md", customers.get(1074).getCompany());
	}

	@Test
	@DisplayName("Record 1075: Address is 1979 Lake Ave")
	void AddressOfRecord1075() {
		assertEquals("1979 Lake Ave", customers.get(1074).getAddress());
	}

	@Test
	@DisplayName("Record 1075: City is Altadena")
	void CityOfRecord1075() {
		assertEquals("Altadena", customers.get(1074).getCity());
	}

	@Test
	@DisplayName("Record 1075: County is Los Angeles")
	void CountyOfRecord1075() {
		assertEquals("Los Angeles", customers.get(1074).getCounty());
	}

	@Test
	@DisplayName("Record 1075: State is CA")
	void StateOfRecord1075() {
		assertEquals("CA", customers.get(1074).getState());
	}

	@Test
	@DisplayName("Record 1075: ZIP is 91001")
	void ZIPOfRecord1075() {
		assertEquals("91001", customers.get(1074).getZIP());
	}

	@Test
	@DisplayName("Record 1075: Phone is 626-794-5492")
	void PhoneOfRecord1075() {
		assertEquals("626-794-5492", customers.get(1074).getPhone());
	}

	@Test
	@DisplayName("Record 1075: Fax is 626-794-1151")
	void FaxOfRecord1075() {
		assertEquals("626-794-1151", customers.get(1074).getFax());
	}

	@Test
	@DisplayName("Record 1075: Email is casey@bonnifield.com")
	void EmailOfRecord1075() {
		assertEquals("casey@bonnifield.com", customers.get(1074).getEmail());
	}

	@Test
	@DisplayName("Record 1075: Web is http://www.caseybonnifield.com")
	void WebOfRecord1075() {
		assertEquals("http://www.caseybonnifield.com", customers.get(1074).getWeb());
	}
}
