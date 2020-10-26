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

@Tag("46")
class Record_3414 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3414: FirstName is Francisco")
	void FirstNameOfRecord3414() {
		assertEquals("Francisco", customers.get(3413).getFirstName());
	}

	@Test
	@DisplayName("Record 3414: LastName is Gewinner")
	void LastNameOfRecord3414() {
		assertEquals("Gewinner", customers.get(3413).getLastName());
	}

	@Test
	@DisplayName("Record 3414: Company is Borders Unlimited Mexicraft")
	void CompanyOfRecord3414() {
		assertEquals("Borders Unlimited Mexicraft", customers.get(3413).getCompany());
	}

	@Test
	@DisplayName("Record 3414: Address is 190 Moore St")
	void AddressOfRecord3414() {
		assertEquals("190 Moore St", customers.get(3413).getAddress());
	}

	@Test
	@DisplayName("Record 3414: City is Hackensack")
	void CityOfRecord3414() {
		assertEquals("Hackensack", customers.get(3413).getCity());
	}

	@Test
	@DisplayName("Record 3414: County is Bergen")
	void CountyOfRecord3414() {
		assertEquals("Bergen", customers.get(3413).getCounty());
	}

	@Test
	@DisplayName("Record 3414: State is NJ")
	void StateOfRecord3414() {
		assertEquals("NJ", customers.get(3413).getState());
	}

	@Test
	@DisplayName("Record 3414: ZIP is 7601")
	void ZIPOfRecord3414() {
		assertEquals("7601", customers.get(3413).getZIP());
	}

	@Test
	@DisplayName("Record 3414: Phone is 201-342-3584")
	void PhoneOfRecord3414() {
		assertEquals("201-342-3584", customers.get(3413).getPhone());
	}

	@Test
	@DisplayName("Record 3414: Fax is 201-342-7291")
	void FaxOfRecord3414() {
		assertEquals("201-342-7291", customers.get(3413).getFax());
	}

	@Test
	@DisplayName("Record 3414: Email is francisco@gewinner.com")
	void EmailOfRecord3414() {
		assertEquals("francisco@gewinner.com", customers.get(3413).getEmail());
	}

	@Test
	@DisplayName("Record 3414: Web is http://www.franciscogewinner.com")
	void WebOfRecord3414() {
		assertEquals("http://www.franciscogewinner.com", customers.get(3413).getWeb());
	}
}
