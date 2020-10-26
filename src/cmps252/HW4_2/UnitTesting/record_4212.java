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

@Tag("9")
class Record_4212 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4212: FirstName is Nellie")
	void FirstNameOfRecord4212() {
		assertEquals("Nellie", customers.get(4211).getFirstName());
	}

	@Test
	@DisplayName("Record 4212: LastName is Curlis")
	void LastNameOfRecord4212() {
		assertEquals("Curlis", customers.get(4211).getLastName());
	}

	@Test
	@DisplayName("Record 4212: Company is Price Mcnabb")
	void CompanyOfRecord4212() {
		assertEquals("Price Mcnabb", customers.get(4211).getCompany());
	}

	@Test
	@DisplayName("Record 4212: Address is 7952 Nw 66th St")
	void AddressOfRecord4212() {
		assertEquals("7952 Nw 66th St", customers.get(4211).getAddress());
	}

	@Test
	@DisplayName("Record 4212: City is Miami")
	void CityOfRecord4212() {
		assertEquals("Miami", customers.get(4211).getCity());
	}

	@Test
	@DisplayName("Record 4212: County is Miami-Dade")
	void CountyOfRecord4212() {
		assertEquals("Miami-Dade", customers.get(4211).getCounty());
	}

	@Test
	@DisplayName("Record 4212: State is FL")
	void StateOfRecord4212() {
		assertEquals("FL", customers.get(4211).getState());
	}

	@Test
	@DisplayName("Record 4212: ZIP is 33166")
	void ZIPOfRecord4212() {
		assertEquals("33166", customers.get(4211).getZIP());
	}

	@Test
	@DisplayName("Record 4212: Phone is 305-470-4058")
	void PhoneOfRecord4212() {
		assertEquals("305-470-4058", customers.get(4211).getPhone());
	}

	@Test
	@DisplayName("Record 4212: Fax is 305-470-1318")
	void FaxOfRecord4212() {
		assertEquals("305-470-1318", customers.get(4211).getFax());
	}

	@Test
	@DisplayName("Record 4212: Email is nellie@curlis.com")
	void EmailOfRecord4212() {
		assertEquals("nellie@curlis.com", customers.get(4211).getEmail());
	}

	@Test
	@DisplayName("Record 4212: Web is http://www.nelliecurlis.com")
	void WebOfRecord4212() {
		assertEquals("http://www.nelliecurlis.com", customers.get(4211).getWeb());
	}
}
