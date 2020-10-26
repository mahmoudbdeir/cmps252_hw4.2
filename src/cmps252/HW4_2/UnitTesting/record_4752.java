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
class Record_4752 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4752: FirstName is Ora")
	void FirstNameOfRecord4752() {
		assertEquals("Ora", customers.get(4751).getFirstName());
	}

	@Test
	@DisplayName("Record 4752: LastName is Agamao")
	void LastNameOfRecord4752() {
		assertEquals("Agamao", customers.get(4751).getLastName());
	}

	@Test
	@DisplayName("Record 4752: Company is Mandarin Yen")
	void CompanyOfRecord4752() {
		assertEquals("Mandarin Yen", customers.get(4751).getCompany());
	}

	@Test
	@DisplayName("Record 4752: Address is 4800 S Hulen St  #-240")
	void AddressOfRecord4752() {
		assertEquals("4800 S Hulen St  #-240", customers.get(4751).getAddress());
	}

	@Test
	@DisplayName("Record 4752: City is Fort Worth")
	void CityOfRecord4752() {
		assertEquals("Fort Worth", customers.get(4751).getCity());
	}

	@Test
	@DisplayName("Record 4752: County is Tarrant")
	void CountyOfRecord4752() {
		assertEquals("Tarrant", customers.get(4751).getCounty());
	}

	@Test
	@DisplayName("Record 4752: State is TX")
	void StateOfRecord4752() {
		assertEquals("TX", customers.get(4751).getState());
	}

	@Test
	@DisplayName("Record 4752: ZIP is 76132")
	void ZIPOfRecord4752() {
		assertEquals("76132", customers.get(4751).getZIP());
	}

	@Test
	@DisplayName("Record 4752: Phone is 817-370-6164")
	void PhoneOfRecord4752() {
		assertEquals("817-370-6164", customers.get(4751).getPhone());
	}

	@Test
	@DisplayName("Record 4752: Fax is 817-370-5699")
	void FaxOfRecord4752() {
		assertEquals("817-370-5699", customers.get(4751).getFax());
	}

	@Test
	@DisplayName("Record 4752: Email is ora@agamao.com")
	void EmailOfRecord4752() {
		assertEquals("ora@agamao.com", customers.get(4751).getEmail());
	}

	@Test
	@DisplayName("Record 4752: Web is http://www.oraagamao.com")
	void WebOfRecord4752() {
		assertEquals("http://www.oraagamao.com", customers.get(4751).getWeb());
	}
}
