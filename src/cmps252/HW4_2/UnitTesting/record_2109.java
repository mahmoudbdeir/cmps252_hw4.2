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
class Record_2109 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2109: FirstName is Geraldo")
	void FirstNameOfRecord2109() {
		assertEquals("Geraldo", customers.get(2108).getFirstName());
	}

	@Test
	@DisplayName("Record 2109: LastName is Litsinger")
	void LastNameOfRecord2109() {
		assertEquals("Litsinger", customers.get(2108).getLastName());
	}

	@Test
	@DisplayName("Record 2109: Company is Musi Matic Inc")
	void CompanyOfRecord2109() {
		assertEquals("Musi Matic Inc", customers.get(2108).getCompany());
	}

	@Test
	@DisplayName("Record 2109: Address is 5100 Hopyard Rd")
	void AddressOfRecord2109() {
		assertEquals("5100 Hopyard Rd", customers.get(2108).getAddress());
	}

	@Test
	@DisplayName("Record 2109: City is Pleasanton")
	void CityOfRecord2109() {
		assertEquals("Pleasanton", customers.get(2108).getCity());
	}

	@Test
	@DisplayName("Record 2109: County is Alameda")
	void CountyOfRecord2109() {
		assertEquals("Alameda", customers.get(2108).getCounty());
	}

	@Test
	@DisplayName("Record 2109: State is CA")
	void StateOfRecord2109() {
		assertEquals("CA", customers.get(2108).getState());
	}

	@Test
	@DisplayName("Record 2109: ZIP is 94588")
	void ZIPOfRecord2109() {
		assertEquals("94588", customers.get(2108).getZIP());
	}

	@Test
	@DisplayName("Record 2109: Phone is 925-463-8135")
	void PhoneOfRecord2109() {
		assertEquals("925-463-8135", customers.get(2108).getPhone());
	}

	@Test
	@DisplayName("Record 2109: Fax is 925-463-1925")
	void FaxOfRecord2109() {
		assertEquals("925-463-1925", customers.get(2108).getFax());
	}

	@Test
	@DisplayName("Record 2109: Email is geraldo@litsinger.com")
	void EmailOfRecord2109() {
		assertEquals("geraldo@litsinger.com", customers.get(2108).getEmail());
	}

	@Test
	@DisplayName("Record 2109: Web is http://www.geraldolitsinger.com")
	void WebOfRecord2109() {
		assertEquals("http://www.geraldolitsinger.com", customers.get(2108).getWeb());
	}
}
