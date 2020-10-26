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
class Record_4756 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4756: FirstName is Iva")
	void FirstNameOfRecord4756() {
		assertEquals("Iva", customers.get(4755).getFirstName());
	}

	@Test
	@DisplayName("Record 4756: LastName is Biava")
	void LastNameOfRecord4756() {
		assertEquals("Biava", customers.get(4755).getLastName());
	}

	@Test
	@DisplayName("Record 4756: Company is Crawford Waage Hardware")
	void CompanyOfRecord4756() {
		assertEquals("Crawford Waage Hardware", customers.get(4755).getCompany());
	}

	@Test
	@DisplayName("Record 4756: Address is 14660 Doolittle Dr")
	void AddressOfRecord4756() {
		assertEquals("14660 Doolittle Dr", customers.get(4755).getAddress());
	}

	@Test
	@DisplayName("Record 4756: City is San Leandro")
	void CityOfRecord4756() {
		assertEquals("San Leandro", customers.get(4755).getCity());
	}

	@Test
	@DisplayName("Record 4756: County is Alameda")
	void CountyOfRecord4756() {
		assertEquals("Alameda", customers.get(4755).getCounty());
	}

	@Test
	@DisplayName("Record 4756: State is CA")
	void StateOfRecord4756() {
		assertEquals("CA", customers.get(4755).getState());
	}

	@Test
	@DisplayName("Record 4756: ZIP is 94577")
	void ZIPOfRecord4756() {
		assertEquals("94577", customers.get(4755).getZIP());
	}

	@Test
	@DisplayName("Record 4756: Phone is 510-893-0302")
	void PhoneOfRecord4756() {
		assertEquals("510-893-0302", customers.get(4755).getPhone());
	}

	@Test
	@DisplayName("Record 4756: Fax is 510-893-6375")
	void FaxOfRecord4756() {
		assertEquals("510-893-6375", customers.get(4755).getFax());
	}

	@Test
	@DisplayName("Record 4756: Email is iva@biava.com")
	void EmailOfRecord4756() {
		assertEquals("iva@biava.com", customers.get(4755).getEmail());
	}

	@Test
	@DisplayName("Record 4756: Web is http://www.ivabiava.com")
	void WebOfRecord4756() {
		assertEquals("http://www.ivabiava.com", customers.get(4755).getWeb());
	}
}
