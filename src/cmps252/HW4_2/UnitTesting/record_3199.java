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

@Tag("41")
class Record_3199 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3199: FirstName is Kira")
	void FirstNameOfRecord3199() {
		assertEquals("Kira", customers.get(3198).getFirstName());
	}

	@Test
	@DisplayName("Record 3199: LastName is Amorello")
	void LastNameOfRecord3199() {
		assertEquals("Amorello", customers.get(3198).getLastName());
	}

	@Test
	@DisplayName("Record 3199: Company is Clinton Falls Riv Cafe & Ctrg")
	void CompanyOfRecord3199() {
		assertEquals("Clinton Falls Riv Cafe & Ctrg", customers.get(3198).getCompany());
	}

	@Test
	@DisplayName("Record 3199: Address is Box #-35690")
	void AddressOfRecord3199() {
		assertEquals("Box #-35690", customers.get(3198).getAddress());
	}

	@Test
	@DisplayName("Record 3199: City is Louisville")
	void CityOfRecord3199() {
		assertEquals("Louisville", customers.get(3198).getCity());
	}

	@Test
	@DisplayName("Record 3199: County is Jefferson")
	void CountyOfRecord3199() {
		assertEquals("Jefferson", customers.get(3198).getCounty());
	}

	@Test
	@DisplayName("Record 3199: State is KY")
	void StateOfRecord3199() {
		assertEquals("KY", customers.get(3198).getState());
	}

	@Test
	@DisplayName("Record 3199: ZIP is 40232")
	void ZIPOfRecord3199() {
		assertEquals("40232", customers.get(3198).getZIP());
	}

	@Test
	@DisplayName("Record 3199: Phone is 502-637-7982")
	void PhoneOfRecord3199() {
		assertEquals("502-637-7982", customers.get(3198).getPhone());
	}

	@Test
	@DisplayName("Record 3199: Fax is 502-637-9543")
	void FaxOfRecord3199() {
		assertEquals("502-637-9543", customers.get(3198).getFax());
	}

	@Test
	@DisplayName("Record 3199: Email is kira@amorello.com")
	void EmailOfRecord3199() {
		assertEquals("kira@amorello.com", customers.get(3198).getEmail());
	}

	@Test
	@DisplayName("Record 3199: Web is http://www.kiraamorello.com")
	void WebOfRecord3199() {
		assertEquals("http://www.kiraamorello.com", customers.get(3198).getWeb());
	}
}
