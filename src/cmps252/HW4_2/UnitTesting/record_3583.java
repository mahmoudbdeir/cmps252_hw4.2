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
class Record_3583 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3583: FirstName is Carroll")
	void FirstNameOfRecord3583() {
		assertEquals("Carroll", customers.get(3582).getFirstName());
	}

	@Test
	@DisplayName("Record 3583: LastName is Tayan")
	void LastNameOfRecord3583() {
		assertEquals("Tayan", customers.get(3582).getLastName());
	}

	@Test
	@DisplayName("Record 3583: Company is ysenbrey Electrical Serv Inc")
	void CompanyOfRecord3583() {
		assertEquals("ysenbrey Electrical Serv Inc", customers.get(3582).getCompany());
	}

	@Test
	@DisplayName("Record 3583: Address is 548 1st St")
	void AddressOfRecord3583() {
		assertEquals("548 1st St", customers.get(3582).getAddress());
	}

	@Test
	@DisplayName("Record 3583: City is Crete")
	void CityOfRecord3583() {
		assertEquals("Crete", customers.get(3582).getCity());
	}

	@Test
	@DisplayName("Record 3583: County is Will")
	void CountyOfRecord3583() {
		assertEquals("Will", customers.get(3582).getCounty());
	}

	@Test
	@DisplayName("Record 3583: State is IL")
	void StateOfRecord3583() {
		assertEquals("IL", customers.get(3582).getState());
	}

	@Test
	@DisplayName("Record 3583: ZIP is 60417")
	void ZIPOfRecord3583() {
		assertEquals("60417", customers.get(3582).getZIP());
	}

	@Test
	@DisplayName("Record 3583: Phone is 708-672-8741")
	void PhoneOfRecord3583() {
		assertEquals("708-672-8741", customers.get(3582).getPhone());
	}

	@Test
	@DisplayName("Record 3583: Fax is 708-672-5725")
	void FaxOfRecord3583() {
		assertEquals("708-672-5725", customers.get(3582).getFax());
	}

	@Test
	@DisplayName("Record 3583: Email is carroll@tayan.com")
	void EmailOfRecord3583() {
		assertEquals("carroll@tayan.com", customers.get(3582).getEmail());
	}

	@Test
	@DisplayName("Record 3583: Web is http://www.carrolltayan.com")
	void WebOfRecord3583() {
		assertEquals("http://www.carrolltayan.com", customers.get(3582).getWeb());
	}
}
