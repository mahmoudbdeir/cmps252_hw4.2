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

@Tag("13")
class Record_765 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 765: FirstName is Kelley")
	void FirstNameOfRecord765() {
		assertEquals("Kelley", customers.get(764).getFirstName());
	}

	@Test
	@DisplayName("Record 765: LastName is Carosiello")
	void LastNameOfRecord765() {
		assertEquals("Carosiello", customers.get(764).getLastName());
	}

	@Test
	@DisplayName("Record 765: Company is Music For All Seasons")
	void CompanyOfRecord765() {
		assertEquals("Music For All Seasons", customers.get(764).getCompany());
	}

	@Test
	@DisplayName("Record 765: Address is 1822 Monroe Ave")
	void AddressOfRecord765() {
		assertEquals("1822 Monroe Ave", customers.get(764).getAddress());
	}

	@Test
	@DisplayName("Record 765: City is Rochester")
	void CityOfRecord765() {
		assertEquals("Rochester", customers.get(764).getCity());
	}

	@Test
	@DisplayName("Record 765: County is Monroe")
	void CountyOfRecord765() {
		assertEquals("Monroe", customers.get(764).getCounty());
	}

	@Test
	@DisplayName("Record 765: State is NY")
	void StateOfRecord765() {
		assertEquals("NY", customers.get(764).getState());
	}

	@Test
	@DisplayName("Record 765: ZIP is 14618")
	void ZIPOfRecord765() {
		assertEquals("14618", customers.get(764).getZIP());
	}

	@Test
	@DisplayName("Record 765: Phone is 585-271-4880")
	void PhoneOfRecord765() {
		assertEquals("585-271-4880", customers.get(764).getPhone());
	}

	@Test
	@DisplayName("Record 765: Fax is 585-271-9132")
	void FaxOfRecord765() {
		assertEquals("585-271-9132", customers.get(764).getFax());
	}

	@Test
	@DisplayName("Record 765: Email is kelley@carosiello.com")
	void EmailOfRecord765() {
		assertEquals("kelley@carosiello.com", customers.get(764).getEmail());
	}

	@Test
	@DisplayName("Record 765: Web is http://www.kelleycarosiello.com")
	void WebOfRecord765() {
		assertEquals("http://www.kelleycarosiello.com", customers.get(764).getWeb());
	}
}
