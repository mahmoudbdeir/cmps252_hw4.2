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

@Tag("12")
class Record_4697 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4697: FirstName is Kisha")
	void FirstNameOfRecord4697() {
		assertEquals("Kisha", customers.get(4696).getFirstName());
	}

	@Test
	@DisplayName("Record 4697: LastName is Pesin")
	void LastNameOfRecord4697() {
		assertEquals("Pesin", customers.get(4696).getLastName());
	}

	@Test
	@DisplayName("Record 4697: Company is Opton, Michael P Esq")
	void CompanyOfRecord4697() {
		assertEquals("Opton, Michael P Esq", customers.get(4696).getCompany());
	}

	@Test
	@DisplayName("Record 4697: Address is 13839 L St")
	void AddressOfRecord4697() {
		assertEquals("13839 L St", customers.get(4696).getAddress());
	}

	@Test
	@DisplayName("Record 4697: City is Omaha")
	void CityOfRecord4697() {
		assertEquals("Omaha", customers.get(4696).getCity());
	}

	@Test
	@DisplayName("Record 4697: County is Douglas")
	void CountyOfRecord4697() {
		assertEquals("Douglas", customers.get(4696).getCounty());
	}

	@Test
	@DisplayName("Record 4697: State is NE")
	void StateOfRecord4697() {
		assertEquals("NE", customers.get(4696).getState());
	}

	@Test
	@DisplayName("Record 4697: ZIP is 68137")
	void ZIPOfRecord4697() {
		assertEquals("68137", customers.get(4696).getZIP());
	}

	@Test
	@DisplayName("Record 4697: Phone is 402-895-7891")
	void PhoneOfRecord4697() {
		assertEquals("402-895-7891", customers.get(4696).getPhone());
	}

	@Test
	@DisplayName("Record 4697: Fax is 402-895-1581")
	void FaxOfRecord4697() {
		assertEquals("402-895-1581", customers.get(4696).getFax());
	}

	@Test
	@DisplayName("Record 4697: Email is kisha@pesin.com")
	void EmailOfRecord4697() {
		assertEquals("kisha@pesin.com", customers.get(4696).getEmail());
	}

	@Test
	@DisplayName("Record 4697: Web is http://www.kishapesin.com")
	void WebOfRecord4697() {
		assertEquals("http://www.kishapesin.com", customers.get(4696).getWeb());
	}
}
