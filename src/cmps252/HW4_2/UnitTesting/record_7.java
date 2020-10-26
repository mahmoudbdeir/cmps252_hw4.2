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

@Tag("0")
class Record_7 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 7: FirstName is Willie")
	void FirstNameOfRecord7() {
		assertEquals("Willie", customers.get(6).getFirstName());
	}

	@Test
	@DisplayName("Record 7: LastName is Coughenour")
	void LastNameOfRecord7() {
		assertEquals("Coughenour", customers.get(6).getLastName());
	}

	@Test
	@DisplayName("Record 7: Company is Adams Rib Rstrnt At Norwalk")
	void CompanyOfRecord7() {
		assertEquals("Adams Rib Rstrnt At Norwalk", customers.get(6).getCompany());
	}

	@Test
	@DisplayName("Record 7: Address is 1715 Saint Marys Ave")
	void AddressOfRecord7() {
		assertEquals("1715 Saint Marys Ave", customers.get(6).getAddress());
	}

	@Test
	@DisplayName("Record 7: City is Parkersburg")
	void CityOfRecord7() {
		assertEquals("Parkersburg", customers.get(6).getCity());
	}

	@Test
	@DisplayName("Record 7: County is Wood")
	void CountyOfRecord7() {
		assertEquals("Wood", customers.get(6).getCounty());
	}

	@Test
	@DisplayName("Record 7: State is WV")
	void StateOfRecord7() {
		assertEquals("WV", customers.get(6).getState());
	}

	@Test
	@DisplayName("Record 7: ZIP is 26101")
	void ZIPOfRecord7() {
		assertEquals("26101", customers.get(6).getZIP());
	}

	@Test
	@DisplayName("Record 7: Phone is 304-422-8589")
	void PhoneOfRecord7() {
		assertEquals("304-422-8589", customers.get(6).getPhone());
	}

	@Test
	@DisplayName("Record 7: Fax is 304-422-8589")
	void FaxOfRecord7() {
		assertEquals("304-422-8589", customers.get(6).getFax());
	}

	@Test
	@DisplayName("Record 7: Email is willie@coughenour.com")
	void EmailOfRecord7() {
		assertEquals("willie@coughenour.com", customers.get(6).getEmail());
	}

	@Test
	@DisplayName("Record 7: Web is http://www.williecoughenour.com")
	void WebOfRecord7() {
		assertEquals("http://www.williecoughenour.com", customers.get(6).getWeb());
	}
}
