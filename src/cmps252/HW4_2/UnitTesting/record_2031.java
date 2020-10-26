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

@Tag("2")
class Record_2031 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2031: FirstName is Bernie")
	void FirstNameOfRecord2031() {
		assertEquals("Bernie", customers.get(2030).getFirstName());
	}

	@Test
	@DisplayName("Record 2031: LastName is Facchine")
	void LastNameOfRecord2031() {
		assertEquals("Facchine", customers.get(2030).getLastName());
	}

	@Test
	@DisplayName("Record 2031: Company is Century 21 Newport Realty")
	void CompanyOfRecord2031() {
		assertEquals("Century 21 Newport Realty", customers.get(2030).getCompany());
	}

	@Test
	@DisplayName("Record 2031: Address is 14001 Orange Ave")
	void AddressOfRecord2031() {
		assertEquals("14001 Orange Ave", customers.get(2030).getAddress());
	}

	@Test
	@DisplayName("Record 2031: City is Paramount")
	void CityOfRecord2031() {
		assertEquals("Paramount", customers.get(2030).getCity());
	}

	@Test
	@DisplayName("Record 2031: County is Los Angeles")
	void CountyOfRecord2031() {
		assertEquals("Los Angeles", customers.get(2030).getCounty());
	}

	@Test
	@DisplayName("Record 2031: State is CA")
	void StateOfRecord2031() {
		assertEquals("CA", customers.get(2030).getState());
	}

	@Test
	@DisplayName("Record 2031: ZIP is 90723")
	void ZIPOfRecord2031() {
		assertEquals("90723", customers.get(2030).getZIP());
	}

	@Test
	@DisplayName("Record 2031: Phone is 562-634-8003")
	void PhoneOfRecord2031() {
		assertEquals("562-634-8003", customers.get(2030).getPhone());
	}

	@Test
	@DisplayName("Record 2031: Fax is 562-634-8667")
	void FaxOfRecord2031() {
		assertEquals("562-634-8667", customers.get(2030).getFax());
	}

	@Test
	@DisplayName("Record 2031: Email is bernie@facchine.com")
	void EmailOfRecord2031() {
		assertEquals("bernie@facchine.com", customers.get(2030).getEmail());
	}

	@Test
	@DisplayName("Record 2031: Web is http://www.berniefacchine.com")
	void WebOfRecord2031() {
		assertEquals("http://www.berniefacchine.com", customers.get(2030).getWeb());
	}
}
