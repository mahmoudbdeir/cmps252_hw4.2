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
class Record_4415 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4415: FirstName is Rhoda")
	void FirstNameOfRecord4415() {
		assertEquals("Rhoda", customers.get(4414).getFirstName());
	}

	@Test
	@DisplayName("Record 4415: LastName is Tirino")
	void LastNameOfRecord4415() {
		assertEquals("Tirino", customers.get(4414).getLastName());
	}

	@Test
	@DisplayName("Record 4415: Company is Kunts, Charles P Esq")
	void CompanyOfRecord4415() {
		assertEquals("Kunts, Charles P Esq", customers.get(4414).getCompany());
	}

	@Test
	@DisplayName("Record 4415: Address is 111 Sw 5th Ave  #-2000")
	void AddressOfRecord4415() {
		assertEquals("111 Sw 5th Ave  #-2000", customers.get(4414).getAddress());
	}

	@Test
	@DisplayName("Record 4415: City is Portland")
	void CityOfRecord4415() {
		assertEquals("Portland", customers.get(4414).getCity());
	}

	@Test
	@DisplayName("Record 4415: County is Multnomah")
	void CountyOfRecord4415() {
		assertEquals("Multnomah", customers.get(4414).getCounty());
	}

	@Test
	@DisplayName("Record 4415: State is OR")
	void StateOfRecord4415() {
		assertEquals("OR", customers.get(4414).getState());
	}

	@Test
	@DisplayName("Record 4415: ZIP is 97204")
	void ZIPOfRecord4415() {
		assertEquals("97204", customers.get(4414).getZIP());
	}

	@Test
	@DisplayName("Record 4415: Phone is 503-299-5399")
	void PhoneOfRecord4415() {
		assertEquals("503-299-5399", customers.get(4414).getPhone());
	}

	@Test
	@DisplayName("Record 4415: Fax is 503-299-1333")
	void FaxOfRecord4415() {
		assertEquals("503-299-1333", customers.get(4414).getFax());
	}

	@Test
	@DisplayName("Record 4415: Email is rhoda@tirino.com")
	void EmailOfRecord4415() {
		assertEquals("rhoda@tirino.com", customers.get(4414).getEmail());
	}

	@Test
	@DisplayName("Record 4415: Web is http://www.rhodatirino.com")
	void WebOfRecord4415() {
		assertEquals("http://www.rhodatirino.com", customers.get(4414).getWeb());
	}
}
