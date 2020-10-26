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

@Tag("30")
class Record_2276 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2276: FirstName is Rocky")
	void FirstNameOfRecord2276() {
		assertEquals("Rocky", customers.get(2275).getFirstName());
	}

	@Test
	@DisplayName("Record 2276: LastName is Sauret")
	void LastNameOfRecord2276() {
		assertEquals("Sauret", customers.get(2275).getLastName());
	}

	@Test
	@DisplayName("Record 2276: Company is Drouilhet, Patrick W Esq")
	void CompanyOfRecord2276() {
		assertEquals("Drouilhet, Patrick W Esq", customers.get(2275).getCompany());
	}

	@Test
	@DisplayName("Record 2276: Address is 2800 W March Ln  #-220")
	void AddressOfRecord2276() {
		assertEquals("2800 W March Ln  #-220", customers.get(2275).getAddress());
	}

	@Test
	@DisplayName("Record 2276: City is Stockton")
	void CityOfRecord2276() {
		assertEquals("Stockton", customers.get(2275).getCity());
	}

	@Test
	@DisplayName("Record 2276: County is San Joaquin")
	void CountyOfRecord2276() {
		assertEquals("San Joaquin", customers.get(2275).getCounty());
	}

	@Test
	@DisplayName("Record 2276: State is CA")
	void StateOfRecord2276() {
		assertEquals("CA", customers.get(2275).getState());
	}

	@Test
	@DisplayName("Record 2276: ZIP is 95219")
	void ZIPOfRecord2276() {
		assertEquals("95219", customers.get(2275).getZIP());
	}

	@Test
	@DisplayName("Record 2276: Phone is 209-952-9431")
	void PhoneOfRecord2276() {
		assertEquals("209-952-9431", customers.get(2275).getPhone());
	}

	@Test
	@DisplayName("Record 2276: Fax is 209-952-3344")
	void FaxOfRecord2276() {
		assertEquals("209-952-3344", customers.get(2275).getFax());
	}

	@Test
	@DisplayName("Record 2276: Email is rocky@sauret.com")
	void EmailOfRecord2276() {
		assertEquals("rocky@sauret.com", customers.get(2275).getEmail());
	}

	@Test
	@DisplayName("Record 2276: Web is http://www.rockysauret.com")
	void WebOfRecord2276() {
		assertEquals("http://www.rockysauret.com", customers.get(2275).getWeb());
	}
}
