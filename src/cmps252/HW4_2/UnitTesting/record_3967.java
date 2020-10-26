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

@Tag("26")
class Record_3967 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3967: FirstName is Elbert")
	void FirstNameOfRecord3967() {
		assertEquals("Elbert", customers.get(3966).getFirstName());
	}

	@Test
	@DisplayName("Record 3967: LastName is Gillin")
	void LastNameOfRecord3967() {
		assertEquals("Gillin", customers.get(3966).getLastName());
	}

	@Test
	@DisplayName("Record 3967: Company is Walsh, Mark C Esq")
	void CompanyOfRecord3967() {
		assertEquals("Walsh, Mark C Esq", customers.get(3966).getCompany());
	}

	@Test
	@DisplayName("Record 3967: Address is 603 N Main St")
	void AddressOfRecord3967() {
		assertEquals("603 N Main St", customers.get(3966).getAddress());
	}

	@Test
	@DisplayName("Record 3967: City is Stanley")
	void CityOfRecord3967() {
		assertEquals("Stanley", customers.get(3966).getCity());
	}

	@Test
	@DisplayName("Record 3967: County is Gaston")
	void CountyOfRecord3967() {
		assertEquals("Gaston", customers.get(3966).getCounty());
	}

	@Test
	@DisplayName("Record 3967: State is NC")
	void StateOfRecord3967() {
		assertEquals("NC", customers.get(3966).getState());
	}

	@Test
	@DisplayName("Record 3967: ZIP is 28164")
	void ZIPOfRecord3967() {
		assertEquals("28164", customers.get(3966).getZIP());
	}

	@Test
	@DisplayName("Record 3967: Phone is 704-263-1540")
	void PhoneOfRecord3967() {
		assertEquals("704-263-1540", customers.get(3966).getPhone());
	}

	@Test
	@DisplayName("Record 3967: Fax is 704-263-2328")
	void FaxOfRecord3967() {
		assertEquals("704-263-2328", customers.get(3966).getFax());
	}

	@Test
	@DisplayName("Record 3967: Email is elbert@gillin.com")
	void EmailOfRecord3967() {
		assertEquals("elbert@gillin.com", customers.get(3966).getEmail());
	}

	@Test
	@DisplayName("Record 3967: Web is http://www.elbertgillin.com")
	void WebOfRecord3967() {
		assertEquals("http://www.elbertgillin.com", customers.get(3966).getWeb());
	}
}
