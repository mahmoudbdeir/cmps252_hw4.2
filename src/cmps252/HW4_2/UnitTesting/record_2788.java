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

@Tag("18")
class Record_2788 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2788: FirstName is Kris")
	void FirstNameOfRecord2788() {
		assertEquals("Kris", customers.get(2787).getFirstName());
	}

	@Test
	@DisplayName("Record 2788: LastName is Budish")
	void LastNameOfRecord2788() {
		assertEquals("Budish", customers.get(2787).getLastName());
	}

	@Test
	@DisplayName("Record 2788: Company is Elreta, Alexander Ralston Esq")
	void CompanyOfRecord2788() {
		assertEquals("Elreta, Alexander Ralston Esq", customers.get(2787).getCompany());
	}

	@Test
	@DisplayName("Record 2788: Address is 30 W Main St")
	void AddressOfRecord2788() {
		assertEquals("30 W Main St", customers.get(2787).getAddress());
	}

	@Test
	@DisplayName("Record 2788: City is Amelia")
	void CityOfRecord2788() {
		assertEquals("Amelia", customers.get(2787).getCity());
	}

	@Test
	@DisplayName("Record 2788: County is Clermont")
	void CountyOfRecord2788() {
		assertEquals("Clermont", customers.get(2787).getCounty());
	}

	@Test
	@DisplayName("Record 2788: State is OH")
	void StateOfRecord2788() {
		assertEquals("OH", customers.get(2787).getState());
	}

	@Test
	@DisplayName("Record 2788: ZIP is 45102")
	void ZIPOfRecord2788() {
		assertEquals("45102", customers.get(2787).getZIP());
	}

	@Test
	@DisplayName("Record 2788: Phone is 513-753-6212")
	void PhoneOfRecord2788() {
		assertEquals("513-753-6212", customers.get(2787).getPhone());
	}

	@Test
	@DisplayName("Record 2788: Fax is 513-753-8626")
	void FaxOfRecord2788() {
		assertEquals("513-753-8626", customers.get(2787).getFax());
	}

	@Test
	@DisplayName("Record 2788: Email is kris@budish.com")
	void EmailOfRecord2788() {
		assertEquals("kris@budish.com", customers.get(2787).getEmail());
	}

	@Test
	@DisplayName("Record 2788: Web is http://www.krisbudish.com")
	void WebOfRecord2788() {
		assertEquals("http://www.krisbudish.com", customers.get(2787).getWeb());
	}
}
