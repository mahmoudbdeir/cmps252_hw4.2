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

@Tag("16")
class Record_200 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 200: FirstName is Alexandra")
	void FirstNameOfRecord200() {
		assertEquals("Alexandra", customers.get(199).getFirstName());
	}

	@Test
	@DisplayName("Record 200: LastName is Ayuso")
	void LastNameOfRecord200() {
		assertEquals("Ayuso", customers.get(199).getLastName());
	}

	@Test
	@DisplayName("Record 200: Company is Hylig Mckenry Fraim & Lollar")
	void CompanyOfRecord200() {
		assertEquals("Hylig Mckenry Fraim & Lollar", customers.get(199).getCompany());
	}

	@Test
	@DisplayName("Record 200: Address is 1501 Gilson St")
	void AddressOfRecord200() {
		assertEquals("1501 Gilson St", customers.get(199).getAddress());
	}

	@Test
	@DisplayName("Record 200: City is Madison")
	void CityOfRecord200() {
		assertEquals("Madison", customers.get(199).getCity());
	}

	@Test
	@DisplayName("Record 200: County is Dane")
	void CountyOfRecord200() {
		assertEquals("Dane", customers.get(199).getCounty());
	}

	@Test
	@DisplayName("Record 200: State is WI")
	void StateOfRecord200() {
		assertEquals("WI", customers.get(199).getState());
	}

	@Test
	@DisplayName("Record 200: ZIP is 53715")
	void ZIPOfRecord200() {
		assertEquals("53715", customers.get(199).getZIP());
	}

	@Test
	@DisplayName("Record 200: Phone is 608-257-8746")
	void PhoneOfRecord200() {
		assertEquals("608-257-8746", customers.get(199).getPhone());
	}

	@Test
	@DisplayName("Record 200: Fax is 608-257-2805")
	void FaxOfRecord200() {
		assertEquals("608-257-2805", customers.get(199).getFax());
	}

	@Test
	@DisplayName("Record 200: Email is alexandra@ayuso.com")
	void EmailOfRecord200() {
		assertEquals("alexandra@ayuso.com", customers.get(199).getEmail());
	}

	@Test
	@DisplayName("Record 200: Web is http://www.alexandraayuso.com")
	void WebOfRecord200() {
		assertEquals("http://www.alexandraayuso.com", customers.get(199).getWeb());
	}
}
