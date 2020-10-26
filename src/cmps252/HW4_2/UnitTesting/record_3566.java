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

@Tag("30")
class Record_3566 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3566: FirstName is Alec")
	void FirstNameOfRecord3566() {
		assertEquals("Alec", customers.get(3565).getFirstName());
	}

	@Test
	@DisplayName("Record 3566: LastName is Bates")
	void LastNameOfRecord3566() {
		assertEquals("Bates", customers.get(3565).getLastName());
	}

	@Test
	@DisplayName("Record 3566: Company is Luce, Wayne S Esq")
	void CompanyOfRecord3566() {
		assertEquals("Luce, Wayne S Esq", customers.get(3565).getCompany());
	}

	@Test
	@DisplayName("Record 3566: Address is 1305 Roever Rd")
	void AddressOfRecord3566() {
		assertEquals("1305 Roever Rd", customers.get(3565).getAddress());
	}

	@Test
	@DisplayName("Record 3566: City is Manhattan")
	void CityOfRecord3566() {
		assertEquals("Manhattan", customers.get(3565).getCity());
	}

	@Test
	@DisplayName("Record 3566: County is Riley")
	void CountyOfRecord3566() {
		assertEquals("Riley", customers.get(3565).getCounty());
	}

	@Test
	@DisplayName("Record 3566: State is KS")
	void StateOfRecord3566() {
		assertEquals("KS", customers.get(3565).getState());
	}

	@Test
	@DisplayName("Record 3566: ZIP is 66502")
	void ZIPOfRecord3566() {
		assertEquals("66502", customers.get(3565).getZIP());
	}

	@Test
	@DisplayName("Record 3566: Phone is 785-539-6592")
	void PhoneOfRecord3566() {
		assertEquals("785-539-6592", customers.get(3565).getPhone());
	}

	@Test
	@DisplayName("Record 3566: Fax is 785-539-7133")
	void FaxOfRecord3566() {
		assertEquals("785-539-7133", customers.get(3565).getFax());
	}

	@Test
	@DisplayName("Record 3566: Email is alec@bates.com")
	void EmailOfRecord3566() {
		assertEquals("alec@bates.com", customers.get(3565).getEmail());
	}

	@Test
	@DisplayName("Record 3566: Web is http://www.alecbates.com")
	void WebOfRecord3566() {
		assertEquals("http://www.alecbates.com", customers.get(3565).getWeb());
	}
}
