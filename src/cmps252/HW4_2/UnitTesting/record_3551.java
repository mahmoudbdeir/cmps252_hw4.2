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

@Tag("44")
class Record_3551 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3551: FirstName is Denny")
	void FirstNameOfRecord3551() {
		assertEquals("Denny", customers.get(3550).getFirstName());
	}

	@Test
	@DisplayName("Record 3551: LastName is Putsier")
	void LastNameOfRecord3551() {
		assertEquals("Putsier", customers.get(3550).getLastName());
	}

	@Test
	@DisplayName("Record 3551: Company is Belles, Dale R Phd")
	void CompanyOfRecord3551() {
		assertEquals("Belles, Dale R Phd", customers.get(3550).getCompany());
	}

	@Test
	@DisplayName("Record 3551: Address is 1500 W Saint Paul Ave")
	void AddressOfRecord3551() {
		assertEquals("1500 W Saint Paul Ave", customers.get(3550).getAddress());
	}

	@Test
	@DisplayName("Record 3551: City is Milwaukee")
	void CityOfRecord3551() {
		assertEquals("Milwaukee", customers.get(3550).getCity());
	}

	@Test
	@DisplayName("Record 3551: County is Milwaukee")
	void CountyOfRecord3551() {
		assertEquals("Milwaukee", customers.get(3550).getCounty());
	}

	@Test
	@DisplayName("Record 3551: State is WI")
	void StateOfRecord3551() {
		assertEquals("WI", customers.get(3550).getState());
	}

	@Test
	@DisplayName("Record 3551: ZIP is 53233")
	void ZIPOfRecord3551() {
		assertEquals("53233", customers.get(3550).getZIP());
	}

	@Test
	@DisplayName("Record 3551: Phone is 414-272-5839")
	void PhoneOfRecord3551() {
		assertEquals("414-272-5839", customers.get(3550).getPhone());
	}

	@Test
	@DisplayName("Record 3551: Fax is 414-272-8253")
	void FaxOfRecord3551() {
		assertEquals("414-272-8253", customers.get(3550).getFax());
	}

	@Test
	@DisplayName("Record 3551: Email is denny@putsier.com")
	void EmailOfRecord3551() {
		assertEquals("denny@putsier.com", customers.get(3550).getEmail());
	}

	@Test
	@DisplayName("Record 3551: Web is http://www.dennyputsier.com")
	void WebOfRecord3551() {
		assertEquals("http://www.dennyputsier.com", customers.get(3550).getWeb());
	}
}
