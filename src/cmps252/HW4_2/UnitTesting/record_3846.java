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

@Tag("38")
class Record_3846 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3846: FirstName is Kasey")
	void FirstNameOfRecord3846() {
		assertEquals("Kasey", customers.get(3845).getFirstName());
	}

	@Test
	@DisplayName("Record 3846: LastName is Heltsley")
	void LastNameOfRecord3846() {
		assertEquals("Heltsley", customers.get(3845).getLastName());
	}

	@Test
	@DisplayName("Record 3846: Company is Ibekwe, Ede C Esq")
	void CompanyOfRecord3846() {
		assertEquals("Ibekwe, Ede C Esq", customers.get(3845).getCompany());
	}

	@Test
	@DisplayName("Record 3846: Address is 1148 Professional Dr")
	void AddressOfRecord3846() {
		assertEquals("1148 Professional Dr", customers.get(3845).getAddress());
	}

	@Test
	@DisplayName("Record 3846: City is Williamsburg")
	void CityOfRecord3846() {
		assertEquals("Williamsburg", customers.get(3845).getCity());
	}

	@Test
	@DisplayName("Record 3846: County is James City")
	void CountyOfRecord3846() {
		assertEquals("James City", customers.get(3845).getCounty());
	}

	@Test
	@DisplayName("Record 3846: State is VA")
	void StateOfRecord3846() {
		assertEquals("VA", customers.get(3845).getState());
	}

	@Test
	@DisplayName("Record 3846: ZIP is 23185")
	void ZIPOfRecord3846() {
		assertEquals("23185", customers.get(3845).getZIP());
	}

	@Test
	@DisplayName("Record 3846: Phone is 757-229-3806")
	void PhoneOfRecord3846() {
		assertEquals("757-229-3806", customers.get(3845).getPhone());
	}

	@Test
	@DisplayName("Record 3846: Fax is 757-229-4596")
	void FaxOfRecord3846() {
		assertEquals("757-229-4596", customers.get(3845).getFax());
	}

	@Test
	@DisplayName("Record 3846: Email is kasey@heltsley.com")
	void EmailOfRecord3846() {
		assertEquals("kasey@heltsley.com", customers.get(3845).getEmail());
	}

	@Test
	@DisplayName("Record 3846: Web is http://www.kaseyheltsley.com")
	void WebOfRecord3846() {
		assertEquals("http://www.kaseyheltsley.com", customers.get(3845).getWeb());
	}
}
