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

@Tag("37")
class Record_3448 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3448: FirstName is Berry")
	void FirstNameOfRecord3448() {
		assertEquals("Berry", customers.get(3447).getFirstName());
	}

	@Test
	@DisplayName("Record 3448: LastName is Wallenda")
	void LastNameOfRecord3448() {
		assertEquals("Wallenda", customers.get(3447).getLastName());
	}

	@Test
	@DisplayName("Record 3448: Company is Casey, John J Esq")
	void CompanyOfRecord3448() {
		assertEquals("Casey, John J Esq", customers.get(3447).getCompany());
	}

	@Test
	@DisplayName("Record 3448: Address is 5401 Longley Ln  #-49")
	void AddressOfRecord3448() {
		assertEquals("5401 Longley Ln  #-49", customers.get(3447).getAddress());
	}

	@Test
	@DisplayName("Record 3448: City is Reno")
	void CityOfRecord3448() {
		assertEquals("Reno", customers.get(3447).getCity());
	}

	@Test
	@DisplayName("Record 3448: County is Washoe")
	void CountyOfRecord3448() {
		assertEquals("Washoe", customers.get(3447).getCounty());
	}

	@Test
	@DisplayName("Record 3448: State is NV")
	void StateOfRecord3448() {
		assertEquals("NV", customers.get(3447).getState());
	}

	@Test
	@DisplayName("Record 3448: ZIP is 89511")
	void ZIPOfRecord3448() {
		assertEquals("89511", customers.get(3447).getZIP());
	}

	@Test
	@DisplayName("Record 3448: Phone is 775-827-4858")
	void PhoneOfRecord3448() {
		assertEquals("775-827-4858", customers.get(3447).getPhone());
	}

	@Test
	@DisplayName("Record 3448: Fax is 775-827-3629")
	void FaxOfRecord3448() {
		assertEquals("775-827-3629", customers.get(3447).getFax());
	}

	@Test
	@DisplayName("Record 3448: Email is berry@wallenda.com")
	void EmailOfRecord3448() {
		assertEquals("berry@wallenda.com", customers.get(3447).getEmail());
	}

	@Test
	@DisplayName("Record 3448: Web is http://www.berrywallenda.com")
	void WebOfRecord3448() {
		assertEquals("http://www.berrywallenda.com", customers.get(3447).getWeb());
	}
}
