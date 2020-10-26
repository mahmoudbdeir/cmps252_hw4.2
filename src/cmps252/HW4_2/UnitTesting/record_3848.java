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

@Tag("40")
class Record_3848 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3848: FirstName is Les")
	void FirstNameOfRecord3848() {
		assertEquals("Les", customers.get(3847).getFirstName());
	}

	@Test
	@DisplayName("Record 3848: LastName is Kaan")
	void LastNameOfRecord3848() {
		assertEquals("Kaan", customers.get(3847).getLastName());
	}

	@Test
	@DisplayName("Record 3848: Company is On Stage Gear")
	void CompanyOfRecord3848() {
		assertEquals("On Stage Gear", customers.get(3847).getCompany());
	}

	@Test
	@DisplayName("Record 3848: Address is 4940 Viking Dr  #-622")
	void AddressOfRecord3848() {
		assertEquals("4940 Viking Dr  #-622", customers.get(3847).getAddress());
	}

	@Test
	@DisplayName("Record 3848: City is Minneapolis")
	void CityOfRecord3848() {
		assertEquals("Minneapolis", customers.get(3847).getCity());
	}

	@Test
	@DisplayName("Record 3848: County is Hennepin")
	void CountyOfRecord3848() {
		assertEquals("Hennepin", customers.get(3847).getCounty());
	}

	@Test
	@DisplayName("Record 3848: State is MN")
	void StateOfRecord3848() {
		assertEquals("MN", customers.get(3847).getState());
	}

	@Test
	@DisplayName("Record 3848: ZIP is 55435")
	void ZIPOfRecord3848() {
		assertEquals("55435", customers.get(3847).getZIP());
	}

	@Test
	@DisplayName("Record 3848: Phone is 952-831-2049")
	void PhoneOfRecord3848() {
		assertEquals("952-831-2049", customers.get(3847).getPhone());
	}

	@Test
	@DisplayName("Record 3848: Fax is 952-831-9794")
	void FaxOfRecord3848() {
		assertEquals("952-831-9794", customers.get(3847).getFax());
	}

	@Test
	@DisplayName("Record 3848: Email is les@kaan.com")
	void EmailOfRecord3848() {
		assertEquals("les@kaan.com", customers.get(3847).getEmail());
	}

	@Test
	@DisplayName("Record 3848: Web is http://www.leskaan.com")
	void WebOfRecord3848() {
		assertEquals("http://www.leskaan.com", customers.get(3847).getWeb());
	}
}
