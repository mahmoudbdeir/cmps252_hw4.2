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

@Tag("29")
class Record_2731 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2731: FirstName is Aline")
	void FirstNameOfRecord2731() {
		assertEquals("Aline", customers.get(2730).getFirstName());
	}

	@Test
	@DisplayName("Record 2731: LastName is Tram")
	void LastNameOfRecord2731() {
		assertEquals("Tram", customers.get(2730).getLastName());
	}

	@Test
	@DisplayName("Record 2731: Company is Mohlman, Jay R Esq")
	void CompanyOfRecord2731() {
		assertEquals("Mohlman, Jay R Esq", customers.get(2730).getCompany());
	}

	@Test
	@DisplayName("Record 2731: Address is 8550 Roland St")
	void AddressOfRecord2731() {
		assertEquals("8550 Roland St", customers.get(2730).getAddress());
	}

	@Test
	@DisplayName("Record 2731: City is Buena Park")
	void CityOfRecord2731() {
		assertEquals("Buena Park", customers.get(2730).getCity());
	}

	@Test
	@DisplayName("Record 2731: County is Orange")
	void CountyOfRecord2731() {
		assertEquals("Orange", customers.get(2730).getCounty());
	}

	@Test
	@DisplayName("Record 2731: State is CA")
	void StateOfRecord2731() {
		assertEquals("CA", customers.get(2730).getState());
	}

	@Test
	@DisplayName("Record 2731: ZIP is 90621")
	void ZIPOfRecord2731() {
		assertEquals("90621", customers.get(2730).getZIP());
	}

	@Test
	@DisplayName("Record 2731: Phone is 714-521-6055")
	void PhoneOfRecord2731() {
		assertEquals("714-521-6055", customers.get(2730).getPhone());
	}

	@Test
	@DisplayName("Record 2731: Fax is 714-521-0081")
	void FaxOfRecord2731() {
		assertEquals("714-521-0081", customers.get(2730).getFax());
	}

	@Test
	@DisplayName("Record 2731: Email is aline@tram.com")
	void EmailOfRecord2731() {
		assertEquals("aline@tram.com", customers.get(2730).getEmail());
	}

	@Test
	@DisplayName("Record 2731: Web is http://www.alinetram.com")
	void WebOfRecord2731() {
		assertEquals("http://www.alinetram.com", customers.get(2730).getWeb());
	}
}
