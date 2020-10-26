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

@Tag("26")
class Record_2322 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2322: FirstName is Pauline")
	void FirstNameOfRecord2322() {
		assertEquals("Pauline", customers.get(2321).getFirstName());
	}

	@Test
	@DisplayName("Record 2322: LastName is Kiely")
	void LastNameOfRecord2322() {
		assertEquals("Kiely", customers.get(2321).getLastName());
	}

	@Test
	@DisplayName("Record 2322: Company is Asphalt Contractor")
	void CompanyOfRecord2322() {
		assertEquals("Asphalt Contractor", customers.get(2321).getCompany());
	}

	@Test
	@DisplayName("Record 2322: Address is 1525 Chestnut St")
	void AddressOfRecord2322() {
		assertEquals("1525 Chestnut St", customers.get(2321).getAddress());
	}

	@Test
	@DisplayName("Record 2322: City is Philadelphia")
	void CityOfRecord2322() {
		assertEquals("Philadelphia", customers.get(2321).getCity());
	}

	@Test
	@DisplayName("Record 2322: County is Philadelphia")
	void CountyOfRecord2322() {
		assertEquals("Philadelphia", customers.get(2321).getCounty());
	}

	@Test
	@DisplayName("Record 2322: State is PA")
	void StateOfRecord2322() {
		assertEquals("PA", customers.get(2321).getState());
	}

	@Test
	@DisplayName("Record 2322: ZIP is 19102")
	void ZIPOfRecord2322() {
		assertEquals("19102", customers.get(2321).getZIP());
	}

	@Test
	@DisplayName("Record 2322: Phone is 215-864-7570")
	void PhoneOfRecord2322() {
		assertEquals("215-864-7570", customers.get(2321).getPhone());
	}

	@Test
	@DisplayName("Record 2322: Fax is 215-864-2666")
	void FaxOfRecord2322() {
		assertEquals("215-864-2666", customers.get(2321).getFax());
	}

	@Test
	@DisplayName("Record 2322: Email is pauline@kiely.com")
	void EmailOfRecord2322() {
		assertEquals("pauline@kiely.com", customers.get(2321).getEmail());
	}

	@Test
	@DisplayName("Record 2322: Web is http://www.paulinekiely.com")
	void WebOfRecord2322() {
		assertEquals("http://www.paulinekiely.com", customers.get(2321).getWeb());
	}
}
