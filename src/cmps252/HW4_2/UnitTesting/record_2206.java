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

@Tag("23")
class Record_2206 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2206: FirstName is Wyatt")
	void FirstNameOfRecord2206() {
		assertEquals("Wyatt", customers.get(2205).getFirstName());
	}

	@Test
	@DisplayName("Record 2206: LastName is Leppink")
	void LastNameOfRecord2206() {
		assertEquals("Leppink", customers.get(2205).getLastName());
	}

	@Test
	@DisplayName("Record 2206: Company is Ann Taylor Schwing")
	void CompanyOfRecord2206() {
		assertEquals("Ann Taylor Schwing", customers.get(2205).getCompany());
	}

	@Test
	@DisplayName("Record 2206: Address is 2110 85th St")
	void AddressOfRecord2206() {
		assertEquals("2110 85th St", customers.get(2205).getAddress());
	}

	@Test
	@DisplayName("Record 2206: City is North Bergen")
	void CityOfRecord2206() {
		assertEquals("North Bergen", customers.get(2205).getCity());
	}

	@Test
	@DisplayName("Record 2206: County is Hudson")
	void CountyOfRecord2206() {
		assertEquals("Hudson", customers.get(2205).getCounty());
	}

	@Test
	@DisplayName("Record 2206: State is NJ")
	void StateOfRecord2206() {
		assertEquals("NJ", customers.get(2205).getState());
	}

	@Test
	@DisplayName("Record 2206: ZIP is 7047")
	void ZIPOfRecord2206() {
		assertEquals("7047", customers.get(2205).getZIP());
	}

	@Test
	@DisplayName("Record 2206: Phone is 201-869-6225")
	void PhoneOfRecord2206() {
		assertEquals("201-869-6225", customers.get(2205).getPhone());
	}

	@Test
	@DisplayName("Record 2206: Fax is 201-869-5276")
	void FaxOfRecord2206() {
		assertEquals("201-869-5276", customers.get(2205).getFax());
	}

	@Test
	@DisplayName("Record 2206: Email is wyatt@leppink.com")
	void EmailOfRecord2206() {
		assertEquals("wyatt@leppink.com", customers.get(2205).getEmail());
	}

	@Test
	@DisplayName("Record 2206: Web is http://www.wyattleppink.com")
	void WebOfRecord2206() {
		assertEquals("http://www.wyattleppink.com", customers.get(2205).getWeb());
	}
}
