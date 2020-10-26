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

@Tag("20")
class Record_2173 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2173: FirstName is Blake")
	void FirstNameOfRecord2173() {
		assertEquals("Blake", customers.get(2172).getFirstName());
	}

	@Test
	@DisplayName("Record 2173: LastName is Fregozo")
	void LastNameOfRecord2173() {
		assertEquals("Fregozo", customers.get(2172).getLastName());
	}

	@Test
	@DisplayName("Record 2173: Company is Towle, William Esq")
	void CompanyOfRecord2173() {
		assertEquals("Towle, William Esq", customers.get(2172).getCompany());
	}

	@Test
	@DisplayName("Record 2173: Address is 515 John St")
	void AddressOfRecord2173() {
		assertEquals("515 John St", customers.get(2172).getAddress());
	}

	@Test
	@DisplayName("Record 2173: City is Anderson")
	void CityOfRecord2173() {
		assertEquals("Anderson", customers.get(2172).getCity());
	}

	@Test
	@DisplayName("Record 2173: County is Madison")
	void CountyOfRecord2173() {
		assertEquals("Madison", customers.get(2172).getCounty());
	}

	@Test
	@DisplayName("Record 2173: State is IN")
	void StateOfRecord2173() {
		assertEquals("IN", customers.get(2172).getState());
	}

	@Test
	@DisplayName("Record 2173: ZIP is 46016")
	void ZIPOfRecord2173() {
		assertEquals("46016", customers.get(2172).getZIP());
	}

	@Test
	@DisplayName("Record 2173: Phone is 765-643-4562")
	void PhoneOfRecord2173() {
		assertEquals("765-643-4562", customers.get(2172).getPhone());
	}

	@Test
	@DisplayName("Record 2173: Fax is 765-643-4701")
	void FaxOfRecord2173() {
		assertEquals("765-643-4701", customers.get(2172).getFax());
	}

	@Test
	@DisplayName("Record 2173: Email is blake@fregozo.com")
	void EmailOfRecord2173() {
		assertEquals("blake@fregozo.com", customers.get(2172).getEmail());
	}

	@Test
	@DisplayName("Record 2173: Web is http://www.blakefregozo.com")
	void WebOfRecord2173() {
		assertEquals("http://www.blakefregozo.com", customers.get(2172).getWeb());
	}
}
