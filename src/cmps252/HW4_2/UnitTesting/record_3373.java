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

@Tag("25")
class Record_3373 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3373: FirstName is Ilene")
	void FirstNameOfRecord3373() {
		assertEquals("Ilene", customers.get(3372).getFirstName());
	}

	@Test
	@DisplayName("Record 3373: LastName is Bercegeay")
	void LastNameOfRecord3373() {
		assertEquals("Bercegeay", customers.get(3372).getLastName());
	}

	@Test
	@DisplayName("Record 3373: Company is Nani Of Hawaii")
	void CompanyOfRecord3373() {
		assertEquals("Nani Of Hawaii", customers.get(3372).getCompany());
	}

	@Test
	@DisplayName("Record 3373: Address is 1407 W 10th Pl  #-a109")
	void AddressOfRecord3373() {
		assertEquals("1407 W 10th Pl  #-a109", customers.get(3372).getAddress());
	}

	@Test
	@DisplayName("Record 3373: City is Tempe")
	void CityOfRecord3373() {
		assertEquals("Tempe", customers.get(3372).getCity());
	}

	@Test
	@DisplayName("Record 3373: County is Maricopa")
	void CountyOfRecord3373() {
		assertEquals("Maricopa", customers.get(3372).getCounty());
	}

	@Test
	@DisplayName("Record 3373: State is AZ")
	void StateOfRecord3373() {
		assertEquals("AZ", customers.get(3372).getState());
	}

	@Test
	@DisplayName("Record 3373: ZIP is 85281")
	void ZIPOfRecord3373() {
		assertEquals("85281", customers.get(3372).getZIP());
	}

	@Test
	@DisplayName("Record 3373: Phone is 480-829-8371")
	void PhoneOfRecord3373() {
		assertEquals("480-829-8371", customers.get(3372).getPhone());
	}

	@Test
	@DisplayName("Record 3373: Fax is 480-829-9604")
	void FaxOfRecord3373() {
		assertEquals("480-829-9604", customers.get(3372).getFax());
	}

	@Test
	@DisplayName("Record 3373: Email is ilene@bercegeay.com")
	void EmailOfRecord3373() {
		assertEquals("ilene@bercegeay.com", customers.get(3372).getEmail());
	}

	@Test
	@DisplayName("Record 3373: Web is http://www.ilenebercegeay.com")
	void WebOfRecord3373() {
		assertEquals("http://www.ilenebercegeay.com", customers.get(3372).getWeb());
	}
}
