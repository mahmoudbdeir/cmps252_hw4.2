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

@Tag("6")
class Record_3884 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3884: FirstName is Geraldo")
	void FirstNameOfRecord3884() {
		assertEquals("Geraldo", customers.get(3883).getFirstName());
	}

	@Test
	@DisplayName("Record 3884: LastName is Hoelzel")
	void LastNameOfRecord3884() {
		assertEquals("Hoelzel", customers.get(3883).getLastName());
	}

	@Test
	@DisplayName("Record 3884: Company is American Optometric Assn")
	void CompanyOfRecord3884() {
		assertEquals("American Optometric Assn", customers.get(3883).getCompany());
	}

	@Test
	@DisplayName("Record 3884: Address is 230 E Main St")
	void AddressOfRecord3884() {
		assertEquals("230 E Main St", customers.get(3883).getAddress());
	}

	@Test
	@DisplayName("Record 3884: City is Carnegie")
	void CityOfRecord3884() {
		assertEquals("Carnegie", customers.get(3883).getCity());
	}

	@Test
	@DisplayName("Record 3884: County is Allegheny")
	void CountyOfRecord3884() {
		assertEquals("Allegheny", customers.get(3883).getCounty());
	}

	@Test
	@DisplayName("Record 3884: State is PA")
	void StateOfRecord3884() {
		assertEquals("PA", customers.get(3883).getState());
	}

	@Test
	@DisplayName("Record 3884: ZIP is 15106")
	void ZIPOfRecord3884() {
		assertEquals("15106", customers.get(3883).getZIP());
	}

	@Test
	@DisplayName("Record 3884: Phone is 412-279-9120")
	void PhoneOfRecord3884() {
		assertEquals("412-279-9120", customers.get(3883).getPhone());
	}

	@Test
	@DisplayName("Record 3884: Fax is 412-279-3419")
	void FaxOfRecord3884() {
		assertEquals("412-279-3419", customers.get(3883).getFax());
	}

	@Test
	@DisplayName("Record 3884: Email is geraldo@hoelzel.com")
	void EmailOfRecord3884() {
		assertEquals("geraldo@hoelzel.com", customers.get(3883).getEmail());
	}

	@Test
	@DisplayName("Record 3884: Web is http://www.geraldohoelzel.com")
	void WebOfRecord3884() {
		assertEquals("http://www.geraldohoelzel.com", customers.get(3883).getWeb());
	}
}
