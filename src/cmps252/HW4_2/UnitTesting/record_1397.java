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

@Tag("38")
class Record_1397 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1397: FirstName is Vernon")
	void FirstNameOfRecord1397() {
		assertEquals("Vernon", customers.get(1396).getFirstName());
	}

	@Test
	@DisplayName("Record 1397: LastName is Phanthavongsa")
	void LastNameOfRecord1397() {
		assertEquals("Phanthavongsa", customers.get(1396).getLastName());
	}

	@Test
	@DisplayName("Record 1397: Company is Gallagher, Ralph W Esq")
	void CompanyOfRecord1397() {
		assertEquals("Gallagher, Ralph W Esq", customers.get(1396).getCompany());
	}

	@Test
	@DisplayName("Record 1397: Address is 6612 Westminster Blvd")
	void AddressOfRecord1397() {
		assertEquals("6612 Westminster Blvd", customers.get(1396).getAddress());
	}

	@Test
	@DisplayName("Record 1397: City is Westminster")
	void CityOfRecord1397() {
		assertEquals("Westminster", customers.get(1396).getCity());
	}

	@Test
	@DisplayName("Record 1397: County is Orange")
	void CountyOfRecord1397() {
		assertEquals("Orange", customers.get(1396).getCounty());
	}

	@Test
	@DisplayName("Record 1397: State is CA")
	void StateOfRecord1397() {
		assertEquals("CA", customers.get(1396).getState());
	}

	@Test
	@DisplayName("Record 1397: ZIP is 92683")
	void ZIPOfRecord1397() {
		assertEquals("92683", customers.get(1396).getZIP());
	}

	@Test
	@DisplayName("Record 1397: Phone is 714-898-0185")
	void PhoneOfRecord1397() {
		assertEquals("714-898-0185", customers.get(1396).getPhone());
	}

	@Test
	@DisplayName("Record 1397: Fax is 714-898-5531")
	void FaxOfRecord1397() {
		assertEquals("714-898-5531", customers.get(1396).getFax());
	}

	@Test
	@DisplayName("Record 1397: Email is vernon@phanthavongsa.com")
	void EmailOfRecord1397() {
		assertEquals("vernon@phanthavongsa.com", customers.get(1396).getEmail());
	}

	@Test
	@DisplayName("Record 1397: Web is http://www.vernonphanthavongsa.com")
	void WebOfRecord1397() {
		assertEquals("http://www.vernonphanthavongsa.com", customers.get(1396).getWeb());
	}
}
