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

@Tag("32")
class Record_2272 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2272: FirstName is Berta")
	void FirstNameOfRecord2272() {
		assertEquals("Berta", customers.get(2271).getFirstName());
	}

	@Test
	@DisplayName("Record 2272: LastName is Lippeatt")
	void LastNameOfRecord2272() {
		assertEquals("Lippeatt", customers.get(2271).getLastName());
	}

	@Test
	@DisplayName("Record 2272: Company is Schnyder, Gary B Esq")
	void CompanyOfRecord2272() {
		assertEquals("Schnyder, Gary B Esq", customers.get(2271).getCompany());
	}

	@Test
	@DisplayName("Record 2272: Address is 216 Birch St")
	void AddressOfRecord2272() {
		assertEquals("216 Birch St", customers.get(2271).getAddress());
	}

	@Test
	@DisplayName("Record 2272: City is Kennett Square")
	void CityOfRecord2272() {
		assertEquals("Kennett Square", customers.get(2271).getCity());
	}

	@Test
	@DisplayName("Record 2272: County is Chester")
	void CountyOfRecord2272() {
		assertEquals("Chester", customers.get(2271).getCounty());
	}

	@Test
	@DisplayName("Record 2272: State is PA")
	void StateOfRecord2272() {
		assertEquals("PA", customers.get(2271).getState());
	}

	@Test
	@DisplayName("Record 2272: ZIP is 19348")
	void ZIPOfRecord2272() {
		assertEquals("19348", customers.get(2271).getZIP());
	}

	@Test
	@DisplayName("Record 2272: Phone is 610-444-7990")
	void PhoneOfRecord2272() {
		assertEquals("610-444-7990", customers.get(2271).getPhone());
	}

	@Test
	@DisplayName("Record 2272: Fax is 610-444-6244")
	void FaxOfRecord2272() {
		assertEquals("610-444-6244", customers.get(2271).getFax());
	}

	@Test
	@DisplayName("Record 2272: Email is berta@lippeatt.com")
	void EmailOfRecord2272() {
		assertEquals("berta@lippeatt.com", customers.get(2271).getEmail());
	}

	@Test
	@DisplayName("Record 2272: Web is http://www.bertalippeatt.com")
	void WebOfRecord2272() {
		assertEquals("http://www.bertalippeatt.com", customers.get(2271).getWeb());
	}
}
