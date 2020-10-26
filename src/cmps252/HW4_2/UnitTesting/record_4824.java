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

@Tag("11")
class Record_4824 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4824: FirstName is Aubrey")
	void FirstNameOfRecord4824() {
		assertEquals("Aubrey", customers.get(4823).getFirstName());
	}

	@Test
	@DisplayName("Record 4824: LastName is Erickson")
	void LastNameOfRecord4824() {
		assertEquals("Erickson", customers.get(4823).getLastName());
	}

	@Test
	@DisplayName("Record 4824: Company is Susan Burnett Luten Law Ofc")
	void CompanyOfRecord4824() {
		assertEquals("Susan Burnett Luten Law Ofc", customers.get(4823).getCompany());
	}

	@Test
	@DisplayName("Record 4824: Address is 3040 Industry Dr")
	void AddressOfRecord4824() {
		assertEquals("3040 Industry Dr", customers.get(4823).getAddress());
	}

	@Test
	@DisplayName("Record 4824: City is Lancaster")
	void CityOfRecord4824() {
		assertEquals("Lancaster", customers.get(4823).getCity());
	}

	@Test
	@DisplayName("Record 4824: County is Lancaster")
	void CountyOfRecord4824() {
		assertEquals("Lancaster", customers.get(4823).getCounty());
	}

	@Test
	@DisplayName("Record 4824: State is PA")
	void StateOfRecord4824() {
		assertEquals("PA", customers.get(4823).getState());
	}

	@Test
	@DisplayName("Record 4824: ZIP is 17603")
	void ZIPOfRecord4824() {
		assertEquals("17603", customers.get(4823).getZIP());
	}

	@Test
	@DisplayName("Record 4824: Phone is 717-394-3119")
	void PhoneOfRecord4824() {
		assertEquals("717-394-3119", customers.get(4823).getPhone());
	}

	@Test
	@DisplayName("Record 4824: Fax is 717-394-3159")
	void FaxOfRecord4824() {
		assertEquals("717-394-3159", customers.get(4823).getFax());
	}

	@Test
	@DisplayName("Record 4824: Email is aubrey@erickson.com")
	void EmailOfRecord4824() {
		assertEquals("aubrey@erickson.com", customers.get(4823).getEmail());
	}

	@Test
	@DisplayName("Record 4824: Web is http://www.aubreyerickson.com")
	void WebOfRecord4824() {
		assertEquals("http://www.aubreyerickson.com", customers.get(4823).getWeb());
	}
}
