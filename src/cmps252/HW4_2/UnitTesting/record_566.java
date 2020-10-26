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

@Tag("15")
class Record_566 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 566: FirstName is Anthony")
	void FirstNameOfRecord566() {
		assertEquals("Anthony", customers.get(565).getFirstName());
	}

	@Test
	@DisplayName("Record 566: LastName is Tarricone")
	void LastNameOfRecord566() {
		assertEquals("Tarricone", customers.get(565).getLastName());
	}

	@Test
	@DisplayName("Record 566: Company is Saliga Machine Co Inc")
	void CompanyOfRecord566() {
		assertEquals("Saliga Machine Co Inc", customers.get(565).getCompany());
	}

	@Test
	@DisplayName("Record 566: Address is 5005 Chancellor Row")
	void AddressOfRecord566() {
		assertEquals("5005 Chancellor Row", customers.get(565).getAddress());
	}

	@Test
	@DisplayName("Record 566: City is Corpus Christi")
	void CityOfRecord566() {
		assertEquals("Corpus Christi", customers.get(565).getCity());
	}

	@Test
	@DisplayName("Record 566: County is Nueces")
	void CountyOfRecord566() {
		assertEquals("Nueces", customers.get(565).getCounty());
	}

	@Test
	@DisplayName("Record 566: State is TX")
	void StateOfRecord566() {
		assertEquals("TX", customers.get(565).getState());
	}

	@Test
	@DisplayName("Record 566: ZIP is 78416")
	void ZIPOfRecord566() {
		assertEquals("78416", customers.get(565).getZIP());
	}

	@Test
	@DisplayName("Record 566: Phone is 361-854-8307")
	void PhoneOfRecord566() {
		assertEquals("361-854-8307", customers.get(565).getPhone());
	}

	@Test
	@DisplayName("Record 566: Fax is 361-854-5205")
	void FaxOfRecord566() {
		assertEquals("361-854-5205", customers.get(565).getFax());
	}

	@Test
	@DisplayName("Record 566: Email is anthony@tarricone.com")
	void EmailOfRecord566() {
		assertEquals("anthony@tarricone.com", customers.get(565).getEmail());
	}

	@Test
	@DisplayName("Record 566: Web is http://www.anthonytarricone.com")
	void WebOfRecord566() {
		assertEquals("http://www.anthonytarricone.com", customers.get(565).getWeb());
	}
}
