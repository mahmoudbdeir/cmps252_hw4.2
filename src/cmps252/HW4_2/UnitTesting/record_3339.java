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

@Tag("28")
class Record_3339 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3339: FirstName is Dario")
	void FirstNameOfRecord3339() {
		assertEquals("Dario", customers.get(3338).getFirstName());
	}

	@Test
	@DisplayName("Record 3339: LastName is Brost")
	void LastNameOfRecord3339() {
		assertEquals("Brost", customers.get(3338).getLastName());
	}

	@Test
	@DisplayName("Record 3339: Company is Shynen, Stephen A Esq")
	void CompanyOfRecord3339() {
		assertEquals("Shynen, Stephen A Esq", customers.get(3338).getCompany());
	}

	@Test
	@DisplayName("Record 3339: Address is 630 3rd Ave")
	void AddressOfRecord3339() {
		assertEquals("630 3rd Ave", customers.get(3338).getAddress());
	}

	@Test
	@DisplayName("Record 3339: City is New York")
	void CityOfRecord3339() {
		assertEquals("New York", customers.get(3338).getCity());
	}

	@Test
	@DisplayName("Record 3339: County is New York")
	void CountyOfRecord3339() {
		assertEquals("New York", customers.get(3338).getCounty());
	}

	@Test
	@DisplayName("Record 3339: State is NY")
	void StateOfRecord3339() {
		assertEquals("NY", customers.get(3338).getState());
	}

	@Test
	@DisplayName("Record 3339: ZIP is 10017")
	void ZIPOfRecord3339() {
		assertEquals("10017", customers.get(3338).getZIP());
	}

	@Test
	@DisplayName("Record 3339: Phone is 212-599-4190")
	void PhoneOfRecord3339() {
		assertEquals("212-599-4190", customers.get(3338).getPhone());
	}

	@Test
	@DisplayName("Record 3339: Fax is 212-599-9389")
	void FaxOfRecord3339() {
		assertEquals("212-599-9389", customers.get(3338).getFax());
	}

	@Test
	@DisplayName("Record 3339: Email is dario@brost.com")
	void EmailOfRecord3339() {
		assertEquals("dario@brost.com", customers.get(3338).getEmail());
	}

	@Test
	@DisplayName("Record 3339: Web is http://www.dariobrost.com")
	void WebOfRecord3339() {
		assertEquals("http://www.dariobrost.com", customers.get(3338).getWeb());
	}
}
