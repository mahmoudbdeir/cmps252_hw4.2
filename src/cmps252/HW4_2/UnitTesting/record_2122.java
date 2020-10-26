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

@Tag("0")
class Record_2122 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2122: FirstName is Jack")
	void FirstNameOfRecord2122() {
		assertEquals("Jack", customers.get(2121).getFirstName());
	}

	@Test
	@DisplayName("Record 2122: LastName is Deller")
	void LastNameOfRecord2122() {
		assertEquals("Deller", customers.get(2121).getLastName());
	}

	@Test
	@DisplayName("Record 2122: Company is Coplin, Mark D Esq")
	void CompanyOfRecord2122() {
		assertEquals("Coplin, Mark D Esq", customers.get(2121).getCompany());
	}

	@Test
	@DisplayName("Record 2122: Address is 210 36th Ave Sw")
	void AddressOfRecord2122() {
		assertEquals("210 36th Ave Sw", customers.get(2121).getAddress());
	}

	@Test
	@DisplayName("Record 2122: City is Norman")
	void CityOfRecord2122() {
		assertEquals("Norman", customers.get(2121).getCity());
	}

	@Test
	@DisplayName("Record 2122: County is Cleveland")
	void CountyOfRecord2122() {
		assertEquals("Cleveland", customers.get(2121).getCounty());
	}

	@Test
	@DisplayName("Record 2122: State is OK")
	void StateOfRecord2122() {
		assertEquals("OK", customers.get(2121).getState());
	}

	@Test
	@DisplayName("Record 2122: ZIP is 73072")
	void ZIPOfRecord2122() {
		assertEquals("73072", customers.get(2121).getZIP());
	}

	@Test
	@DisplayName("Record 2122: Phone is 405-321-4982")
	void PhoneOfRecord2122() {
		assertEquals("405-321-4982", customers.get(2121).getPhone());
	}

	@Test
	@DisplayName("Record 2122: Fax is 405-321-4844")
	void FaxOfRecord2122() {
		assertEquals("405-321-4844", customers.get(2121).getFax());
	}

	@Test
	@DisplayName("Record 2122: Email is jack@deller.com")
	void EmailOfRecord2122() {
		assertEquals("jack@deller.com", customers.get(2121).getEmail());
	}

	@Test
	@DisplayName("Record 2122: Web is http://www.jackdeller.com")
	void WebOfRecord2122() {
		assertEquals("http://www.jackdeller.com", customers.get(2121).getWeb());
	}
}
