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

@Tag("31")
class Record_4665 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4665: FirstName is Berta")
	void FirstNameOfRecord4665() {
		assertEquals("Berta", customers.get(4664).getFirstName());
	}

	@Test
	@DisplayName("Record 4665: LastName is Gabriele")
	void LastNameOfRecord4665() {
		assertEquals("Gabriele", customers.get(4664).getLastName());
	}

	@Test
	@DisplayName("Record 4665: Company is Frankel Insurance Agency Inc")
	void CompanyOfRecord4665() {
		assertEquals("Frankel Insurance Agency Inc", customers.get(4664).getCompany());
	}

	@Test
	@DisplayName("Record 4665: Address is 2200 W Sedgley Ave")
	void AddressOfRecord4665() {
		assertEquals("2200 W Sedgley Ave", customers.get(4664).getAddress());
	}

	@Test
	@DisplayName("Record 4665: City is Philadelphia")
	void CityOfRecord4665() {
		assertEquals("Philadelphia", customers.get(4664).getCity());
	}

	@Test
	@DisplayName("Record 4665: County is Philadelphia")
	void CountyOfRecord4665() {
		assertEquals("Philadelphia", customers.get(4664).getCounty());
	}

	@Test
	@DisplayName("Record 4665: State is PA")
	void StateOfRecord4665() {
		assertEquals("PA", customers.get(4664).getState());
	}

	@Test
	@DisplayName("Record 4665: ZIP is 19132")
	void ZIPOfRecord4665() {
		assertEquals("19132", customers.get(4664).getZIP());
	}

	@Test
	@DisplayName("Record 4665: Phone is 215-229-1400")
	void PhoneOfRecord4665() {
		assertEquals("215-229-1400", customers.get(4664).getPhone());
	}

	@Test
	@DisplayName("Record 4665: Fax is 215-229-8347")
	void FaxOfRecord4665() {
		assertEquals("215-229-8347", customers.get(4664).getFax());
	}

	@Test
	@DisplayName("Record 4665: Email is berta@gabriele.com")
	void EmailOfRecord4665() {
		assertEquals("berta@gabriele.com", customers.get(4664).getEmail());
	}

	@Test
	@DisplayName("Record 4665: Web is http://www.bertagabriele.com")
	void WebOfRecord4665() {
		assertEquals("http://www.bertagabriele.com", customers.get(4664).getWeb());
	}
}
