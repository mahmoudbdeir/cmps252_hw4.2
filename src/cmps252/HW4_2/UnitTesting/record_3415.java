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

@Tag("34")
class Record_3415 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3415: FirstName is Cherie")
	void FirstNameOfRecord3415() {
		assertEquals("Cherie", customers.get(3414).getFirstName());
	}

	@Test
	@DisplayName("Record 3415: LastName is Shindel")
	void LastNameOfRecord3415() {
		assertEquals("Shindel", customers.get(3414).getLastName());
	}

	@Test
	@DisplayName("Record 3415: Company is Todd, Larry A Esq")
	void CompanyOfRecord3415() {
		assertEquals("Todd, Larry A Esq", customers.get(3414).getCompany());
	}

	@Test
	@DisplayName("Record 3415: Address is 300 Buckelew Ave")
	void AddressOfRecord3415() {
		assertEquals("300 Buckelew Ave", customers.get(3414).getAddress());
	}

	@Test
	@DisplayName("Record 3415: City is Monroe Township")
	void CityOfRecord3415() {
		assertEquals("Monroe Township", customers.get(3414).getCity());
	}

	@Test
	@DisplayName("Record 3415: County is Middlesex")
	void CountyOfRecord3415() {
		assertEquals("Middlesex", customers.get(3414).getCounty());
	}

	@Test
	@DisplayName("Record 3415: State is NJ")
	void StateOfRecord3415() {
		assertEquals("NJ", customers.get(3414).getState());
	}

	@Test
	@DisplayName("Record 3415: ZIP is 8831")
	void ZIPOfRecord3415() {
		assertEquals("8831", customers.get(3414).getZIP());
	}

	@Test
	@DisplayName("Record 3415: Phone is 732-521-5100")
	void PhoneOfRecord3415() {
		assertEquals("732-521-5100", customers.get(3414).getPhone());
	}

	@Test
	@DisplayName("Record 3415: Fax is 732-521-7056")
	void FaxOfRecord3415() {
		assertEquals("732-521-7056", customers.get(3414).getFax());
	}

	@Test
	@DisplayName("Record 3415: Email is cherie@shindel.com")
	void EmailOfRecord3415() {
		assertEquals("cherie@shindel.com", customers.get(3414).getEmail());
	}

	@Test
	@DisplayName("Record 3415: Web is http://www.cherieshindel.com")
	void WebOfRecord3415() {
		assertEquals("http://www.cherieshindel.com", customers.get(3414).getWeb());
	}
}
